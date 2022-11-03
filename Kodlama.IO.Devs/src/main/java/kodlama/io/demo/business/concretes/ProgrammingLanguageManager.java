package kodlama.io.demo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.demo.business.abstracts.ProgrammingLanguageService;
import kodlama.io.demo.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.demo.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.demo.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlama.io.demo.entities.concretes.ProgrammingLanguage;

@Service // Bu sınıf bir business nesnesidir.
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageDao programmingLanguagesDao;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguagesDao) {
		this.programmingLanguagesDao = programmingLanguagesDao;
	}
	// IoC = Bellekte bir şeyi bir kere new'le, herkes onu oradan çağırarak kullansın. Bu şekilde performans artışı sağlasın.

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguagesDao.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages ) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			programmingLanguagesResponse.add(responseItem);
		}
		// Business Rules
		return programmingLanguagesResponse;
	}	

	@Override
	public void delete(int id) {
		programmingLanguagesDao.deleteById(id);	
	}	
	

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		checkNameValid(createProgrammingLanguageRequest.getName());
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		
		programmingLanguagesDao.save(programmingLanguage);
		
	}
	
	private void checkNameValid(String name) throws Exception{
		ProgrammingLanguage isExist = programmingLanguagesDao.findByName(name);
		if (isExist != null) {
			throw new Exception("Name is already exist!!!");
		}
		if (name.isBlank()) {
			throw new Exception("Name can not be empty. Enter a name!!!");
		}
	}

	@Override
	public void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest, int id) throws Exception {
		checkNameValid(createProgrammingLanguageRequest.getName());
		ProgrammingLanguage programmingLanguage = programmingLanguagesDao.findById(id);
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		
		programmingLanguagesDao.save(programmingLanguage);		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguagesDao.findById(id);
	}

	@Override
	public GetAllProgrammingLanguagesResponse getResponseById(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguagesDao.findById(id);
		GetAllProgrammingLanguagesResponse getAllProgrammingLanguagesResponse = new GetAllProgrammingLanguagesResponse();
		getAllProgrammingLanguagesResponse.setName(programmingLanguage.getName());
		getAllProgrammingLanguagesResponse.setId(programmingLanguage.getId());
				
		return getAllProgrammingLanguagesResponse;
	}	
}
