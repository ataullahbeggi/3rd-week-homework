package business;

import core.BaseLogger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private BaseLogger[] loggers;

	public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception{
		Course[] courses = {new Course(1,"Java","Backend Programlama",25),new Course(2,"C#","Backend Programlama",20), new Course(3,"Javascript","Frontend programlama",15)};
		for(Course c :courses) {
			if(course.getName()==c.getName()) {
				throw new Exception("Kurs ismi bulunmaktadır, tekrar edemez.");
			} else if(course.getPrice()<0) {
				throw new Exception("Kurs ücreti 0'dan küçük olamaz.");
			}
		}
		courseDao.add(course);
		for(BaseLogger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
