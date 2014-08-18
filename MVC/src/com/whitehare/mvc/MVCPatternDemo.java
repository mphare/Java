package com.whitehare.mvc;

import org.apache.log4j.Logger;

import com.whitehare.mvc.controller.StudentController;
import com.whitehare.mvc.model.Student;
import com.whitehare.mvc.view.StudentView;

public class MVCPatternDemo
{
  private static Logger logger = Logger.getLogger(MVCPatternDemo.class);

  public static void main(String[] args)
  {

    logger.debug("Getting Student from Database");
    Student model = retrieveStudentFromDatabase();

    StudentView view = new StudentView();

    StudentController controller = new StudentController(model, view);

    controller.updateView();
    controller.setStudentName("John");
    controller.updateView();
  }

  private static Student retrieveStudentFromDatabase()
  {
    Student student = new Student();
    student.setName("Robert");
    student.setRollNo("10");
    return student;
  }

}
