package kodlamaIOHomework3;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOHomework3.business.CategoriesManager;
import kodlamaIOHomework3.business.CoursesManager;
import kodlamaIOHomework3.business.InstructorsManager;
import kodlamaIOHomework3.core.logging.ILogger;
import kodlamaIOHomework3.core.logging.MailLogger;
import kodlamaIOHomework3.dataAccess.hibernate.HibernateCategoriesDao;
import kodlamaIOHomework3.dataAccess.hibernate.HibernateCourseDao;
import kodlamaIOHomework3.dataAccess.hibernate.HibernateInstructorsDao;
import kodlamaIOHomework3.dataAccess.jdbc.JdbcCategoriesDao;
import kodlamaIOHomework3.dataAccess.jdbc.JdbcCoursesDao;
import kodlamaIOHomework3.dataAccess.jdbc.JdbcInstructorsDao;
import kodlamaIOHomework3.entities.Categories;
import kodlamaIOHomework3.entities.Courses;
import kodlamaIOHomework3.entities.Instructors;
import kodlamaIOHomework3.core.logging.DatabaseLogger;
import kodlamaIOHomework3.core.logging.FileLogger;

public class Main {

	public static void main(String[] args) throws Exception {

		ILogger[] iLoggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		/*
		 InstructorsManager instructorsManager = new InstructorsManager(new HibernateInstructorsDao(), iLoggers); 
		 CoursesManager coursesManager = new CoursesManager(new HibernateCourseDao(), iLoggers, courses1);
		 CategoriesManager categoriesManager = new CategoriesManager(new HibernateCategoriesDao(), iLoggers, categories1);
		 */
		
		Instructors instructor = new Instructors("Engin", "Demiroğ");
		Instructors instructors2 = new Instructors("Derin", "Demiroğ");
		InstructorsManager instructorsManager = new InstructorsManager(new JdbcInstructorsDao(), iLoggers);
		System.out.println();
		instructorsManager.add(instructor);
		instructorsManager.add(instructors2);
		instructors2.setInstructorFirstName("Salih");
		instructorsManager.update(instructors2);
		instructorsManager.delete(instructors2);
		System.out.println();
		
		Courses courses1 = new Courses("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 20,"Programming","Engin Demiroğ");
		Courses courses2 = new Courses("Senior Yazılım Geliştirici Yerleştirme Kampı (.Net)", 7, "Programming","Engin Demiroğ");		
		CoursesManager coursesManager = new CoursesManager(new JdbcCoursesDao(), iLoggers);
		System.out.println();
		coursesManager.add(courses1);
		coursesManager.add(courses2);
		courses2.setUnitPrice(-1);		
		coursesManager.update(courses2);
		coursesManager.delete(courses2);
		System.out.println();
		
		Categories categories1 = new Categories("Programming");
		Categories categories2 = new Categories("Software");
		CategoriesManager categoriesManager = new CategoriesManager(new JdbcCategoriesDao(), iLoggers);
		System.out.println();
		categoriesManager.add(categories1);
		categoriesManager.add(categories2);
		categories2.setCategoryName("Data Science");
		categoriesManager.update(categories2);
	}
}
