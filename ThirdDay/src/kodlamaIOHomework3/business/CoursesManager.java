package kodlamaIOHomework3.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOHomework3.core.logging.ILogger;
import kodlamaIOHomework3.dataAccess.ICoursesDao;
import kodlamaIOHomework3.entities.Courses;

public class CoursesManager {
	private ICoursesDao iCoursesDao;
	private ILogger[] iLoggers;
		
	public CoursesManager(ICoursesDao iCoursesDao, ILogger[] iLoggers) {
		this.iCoursesDao = iCoursesDao;
		this.iLoggers = iLoggers;
	}
	
	List<Courses> course = new ArrayList<>();

	public void add(Courses courses) throws Exception {		
			if (courses.getUnitPrice()<0) {
				throw new Exception("Course price can not be under the zero!!!");
			}
			for (Courses c : course) {
				if (c.getCourseName().equals(courses.getCourseName())) {
					throw new Exception("Course name can not use more than ones!!");				
				}
			}
			
			iCoursesDao.add(courses);
			course.add(courses);
			
			for (ILogger iLogger : iLoggers) {
				iLogger.log(courses.getCourseName() + " " + courses.getUnitPrice());
		}
	}
	
	public void update(Courses courses) {
		iCoursesDao.update(courses);
		for (ILogger iLogger : iLoggers) {
			iLogger.log(courses.getCourseName() + " " + courses.getUnitPrice());
		}
	}
	
	public void delete(Courses courses) {
		iCoursesDao.delete(courses);
		for (ILogger iLogger : iLoggers) {
			iLogger.log(courses.getCourseName() + " " + courses.getUnitPrice());
		}
	}
	
}
