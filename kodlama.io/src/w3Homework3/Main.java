package w3Homework3;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.BaseLogger;
import core.DatabaseLogger;
import core.EmailLogger;
import core.FileLogger;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		//logger
		BaseLogger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};
	
		Category category= new Category(4,"Cloud");
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		Course course = new Course(3,"Flutter","Mobil Programlama",10);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		
		Instructor instructor = new Instructor(1,"Engin","Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
	
	}

}
