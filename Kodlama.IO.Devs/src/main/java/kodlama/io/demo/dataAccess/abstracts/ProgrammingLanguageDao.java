package kodlama.io.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.demo.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageDao extends JpaRepository<ProgrammingLanguage, Integer> {
	ProgrammingLanguage findById(int id);
	ProgrammingLanguage findByName(String name);
}
