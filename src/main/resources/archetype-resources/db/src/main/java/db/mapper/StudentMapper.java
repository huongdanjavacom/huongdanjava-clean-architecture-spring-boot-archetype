package ${package}.db.mapper;

import ${package}.db.model.StudentModel;
import ${package}.entities.Student;

public class StudentMapper {

  public static Student toEntity(StudentModel model) {
    if (model == null) {
      return null;
    }

    Student student = new Student(model.getName(), model.getAge());

    return student;
  }
}
