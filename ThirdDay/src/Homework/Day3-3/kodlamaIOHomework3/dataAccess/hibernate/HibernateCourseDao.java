package kodlamaIOHomework3.dataAccess.hibernate;

import kodlamaIOHomework3.dataAccess.ICoursesDao;
import kodlamaIOHomework3.entities.Courses;

public class HibernateCourseDao implements ICoursesDao {

	@Override
	public void add(Courses courses) {
		System.out.println(courses.getCourseName() + " Added to Database with Hibernate");
	}

	@Override
	public void update(Courses courses) {
		System.out.println(courses.getCourseName() + " Updated to Database with Hibernate");
		
	}

	@Override
	public void delete(Courses courses) {
		System.out.println(courses.getCourseName() + " Deleted from Database with Hibernate");
		
	}

}
