package kodlama.io.demo.business.abstracts;

import java.util.List;

import kodlama.io.demo.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.demo.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.demo.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();
	
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	public void update(CreateProgrammingLanguageRequest createProgrammingLanguageRequest, int id) throws Exception;
	public void delete(int id);	
	ProgrammingLanguage getById(int id);
	GetAllProgrammingLanguagesResponse getResponseById(int id);
}
