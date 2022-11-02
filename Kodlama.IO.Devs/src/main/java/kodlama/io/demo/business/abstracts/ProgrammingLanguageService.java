package kodlama.io.demo.business.abstracts;

import java.util.List;

import kodlama.io.demo.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	public void add(ProgrammingLanguage programmingLanguage) throws Exception;
	public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception;
	public void delete(int id);
	ProgrammingLanguage find(int id) throws Exception;
}
