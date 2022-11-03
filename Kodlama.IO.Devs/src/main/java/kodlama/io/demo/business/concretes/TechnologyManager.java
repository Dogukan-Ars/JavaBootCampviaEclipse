package kodlama.io.demo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.demo.business.abstracts.ProgrammingLanguageService;
import kodlama.io.demo.business.abstracts.TechnologyService;
import kodlama.io.demo.business.requests.TechnologyRequest;
import kodlama.io.demo.business.responses.TechnologyResponse;
import kodlama.io.demo.dataAccess.abstracts.TechnologyDao;
import kodlama.io.demo.entities.concretes.ProgrammingLanguage;
import kodlama.io.demo.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyDao technologyDao;
	private ProgrammingLanguageService programmingLanguageService;
	
	public TechnologyManager(TechnologyDao technologyDao, ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
		this.technologyDao = technologyDao;
	}
	
	@Override
	public List<TechnologyResponse> getAll() {
		List<Technology> technologies = technologyDao.findAll();
		List<TechnologyResponse> responses = new ArrayList<>();
		for (Technology technology : technologies) {
			TechnologyResponse technologyResponse = new TechnologyResponse();
			technologyResponse.setName(technology.getName());
			technologyResponse.setProgrammingLanguageId(technology.getProgrammingLanguage().getId());
			technologyResponse.setId(technology.getId());
			responses.add(technologyResponse);
		}
		return responses;
	}

	

	@Override
	public void update(TechnologyRequest technologyRequest, int id) {
		Technology uTechnology = technologyDao.findById(id);
		ProgrammingLanguage uProgrammingLanguageId = programmingLanguageService.getById(technologyRequest.getProgrammingLanguageId());
		uTechnology.setName(technologyRequest.getName());
		uTechnology.setProgrammingLanguage(uProgrammingLanguageId);
		
		technologyDao.save(uTechnology);
	}

	@Override
	public void delete(int id) {
		technologyDao.deleteById(id);
		
	}

	@Override
	public void add(TechnologyRequest technologyRequest) {		
			Technology aTechnology = new Technology();
			ProgrammingLanguage aProgrammingLanguage = programmingLanguageService.getById(technologyRequest.getProgrammingLanguageId());
			aTechnology.setName(technologyRequest.getName());
			aTechnology.setProgrammingLanguage(aProgrammingLanguage);
			
			technologyDao.save(aTechnology);		
	}
	
}
