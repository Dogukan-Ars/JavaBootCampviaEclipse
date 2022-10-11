package kodlamaIOHomework3.dataAccess.hibernate;

import kodlamaIOHomework3.dataAccess.IInstructorsDao;
import kodlamaIOHomework3.entities.Instructors;

public class HibernateInstructorsDao implements IInstructorsDao {

	@Override
	public void add(Instructors instructors) {
		System.out.println(instructors.getInstructorFirstName() + " " + instructors.getInstructorLastName()
				+ " Added to Database with Hibernate");

	}
	@Override
	public void updete(Instructors instructors) {
		System.out.println(instructors.getInstructorFirstName() + " " + instructors.getInstructorLastName()
		+ " Updated to Database with Hibernate");
		
	}

	@Override
	public void delete(Instructors instructors) {
		System.out.println(instructors.getInstructorFirstName() + " " + instructors.getInstructorLastName()
		+ " Deleted from Database with Hibernate");
		
	}

}
