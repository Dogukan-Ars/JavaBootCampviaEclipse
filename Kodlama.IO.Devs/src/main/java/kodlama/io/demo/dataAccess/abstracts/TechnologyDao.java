package kodlama.io.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.demo.entities.concretes.Technology;

public interface TechnologyDao extends JpaRepository<Technology,Integer> {
	Technology findById(int id);
}
