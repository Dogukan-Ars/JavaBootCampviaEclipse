package kodlamaIOHomework3.dataAccess;

import kodlamaIOHomework3.entities.Courses;

public interface ICoursesDao{
	void add(Courses courses);
	void update(Courses courses);
	void delete (Courses courses);
}
