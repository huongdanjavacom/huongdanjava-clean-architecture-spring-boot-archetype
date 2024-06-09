package ${package}.rest.mapper;

import ${package}.entities.Student;
import ${package}.rest.dto.StudentDto;

public class StudentMapper {

  public static StudentDto toDto(Student entity) {
    if (entity == null) {
      return null;
    }

    StudentDto studentDto = new StudentDto(entity.name(), entity.age());

    return studentDto;
  }
}
