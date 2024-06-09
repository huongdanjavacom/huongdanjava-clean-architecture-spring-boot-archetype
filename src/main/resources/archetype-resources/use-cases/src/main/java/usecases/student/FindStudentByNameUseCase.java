package ${package}.usecases.student;

import ${package}.entities.Student;
import ${package}.usecases.adapter.StudentAdapter;

public class FindStudentByNameUseCase {

  private StudentAdapter adapter;

  public FindStudentByNameUseCase(StudentAdapter adapter) {
    this.adapter = adapter;
  }

  public Student find(String name) {
    return adapter.findByName(name);
  }

}
