package kodlamaIOHomework3.business;

import kodlamaIOHomework3.core.logging.ILogger;
import kodlamaIOHomework3.dataAccess.IInstructorsDao;
import kodlamaIOHomework3.entities.Courses;
import kodlamaIOHomework3.entities.Instructors;

public class InstructorsManager {
	private IInstructorsDao iInstructorsDao;
	private ILogger[] iLoggers;

	public InstructorsManager(IInstructorsDao iInstructorsDao, ILogger[] iLoggers) {
		this.iInstructorsDao = iInstructorsDao;
		this.iLoggers = iLoggers;
	}

	public void add(Instructors instructors) {		
		iInstructorsDao.add(instructors);

		for (ILogger iLogger : iLoggers) {
			iLogger.log(instructors.getInstructorFirstName() + " " + instructors.getInstructorLastName());
		}
	}
	
	public void update(Instructors instructors) {
		this.iInstructorsDao.updete(instructors);
		for (ILogger iLogger : iLoggers) {
			iLogger.log(instructors.getInstructorFirstName() + " " + instructors.getInstructorLastName());
		}		
	}
	
	public void delete(Instructors instructors) {
		this.iInstructorsDao.updete(instructors);
		for (ILogger iLogger : iLoggers) {
			iLogger.log(instructors.getInstructorFirstName() + " " + instructors.getInstructorLastName());
		}
	}

}
