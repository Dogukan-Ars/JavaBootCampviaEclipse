package kodlama.io.demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.demo.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlama.io.demo.entities.concretes.ProgrammingLanguage;

@Repository // Bu sınıf bir dataAccess nesnesidir
public class InMemoryProgrammingLanguageDao implements ProgrammingLanguageDao {

	
	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageDao() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Pyton"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(new ProgrammingLanguage(programmingLanguage.getId(),programmingLanguage.getName()));
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, int id) {
		for (ProgrammingLanguage Language : programmingLanguages) {
			if (Language.getId()==id) {
				Language.setName(programmingLanguage.getName());
			}
		}
		
	}

	@Override
	public void delete(int id) {
		programmingLanguages.remove(id);
		
	}

	@Override
	public ProgrammingLanguage find(int id) {
		for (ProgrammingLanguage Language : programmingLanguages) {
			if (Language.getId()==id) {
				return Language;
			}
		}
		return null;
	}
	
	

}
