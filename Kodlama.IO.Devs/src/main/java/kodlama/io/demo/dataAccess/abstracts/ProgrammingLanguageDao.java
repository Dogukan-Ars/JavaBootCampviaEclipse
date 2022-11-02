package kodlama.io.demo.dataAccess.abstracts;

import java.util.List;

import kodlama.io.demo.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageDao {
	List<ProgrammingLanguage> getAll();
	
	public void add(ProgrammingLanguage programmingLanguage);
	public void update(ProgrammingLanguage programmingLanguage, int id);
	public void delete(int id);
	ProgrammingLanguage find(int id);
}
