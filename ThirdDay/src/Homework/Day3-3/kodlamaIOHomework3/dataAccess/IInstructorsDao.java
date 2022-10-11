package kodlamaIOHomework3.dataAccess;

import kodlamaIOHomework3.entities.Instructors;

public interface IInstructorsDao {
	void add(Instructors instructors);
	void updete(Instructors instructors);
	void delete(Instructors instructors);
}
