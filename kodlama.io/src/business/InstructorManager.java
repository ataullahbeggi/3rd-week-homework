package business;

import core.BaseLogger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private BaseLogger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, BaseLogger[] loggers) {
		this.instructorDao=instructorDao;
		this.loggers=loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (BaseLogger logger : loggers) {
			logger.log(instructor.getName()+" "+instructor.getLastName());
		}
	}
}
