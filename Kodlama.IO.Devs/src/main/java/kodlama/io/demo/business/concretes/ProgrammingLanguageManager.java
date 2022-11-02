package kodlama.io.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.demo.business.abstracts.ProgrammingLanguageService;
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
	public List<ProgrammingLanguage> getAll() {
		// Business Rules
		return programmingLanguagesDao.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isIdExist(programmingLanguage.getId())) {
			throw new Exception("Programming Languages Id's can not repeat");
		}
		if (isNameValid(programmingLanguage.getName())) {
			programmingLanguagesDao.add(programmingLanguage);
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Updated");
		}
		if (isNameValid(programmingLanguage.getName())) {
			programmingLanguagesDao.update(programmingLanguage, id);
		}
		
	}

	@Override
	public void delete(int id) {
		programmingLanguagesDao.delete(id);
		
	}

	@Override
	public ProgrammingLanguage find(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Programming Language can not found");
		}
		return programmingLanguagesDao.find(id);
	}

	public boolean isIdExist(int id) {
		for (ProgrammingLanguage Language : getAll()) {
			if (Language.getId() == id) {
				return true;

			}
		}
		return false;
	}
	
	public boolean isNameValid(String name) throws Exception {
		if (name.isBlank()) {
			throw new Exception("Programming languages name's must be written");
		}
		for (ProgrammingLanguage Language : getAll()) {
			if (Language.getName().equals(name)) {
				throw new Exception("Programming Languages name's can not use twice");
			}
		}
		return true;
	}
}
