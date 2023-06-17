package ${package}.db;

import org.springframework.beans.factory.annotation.Autowired;
import ${package}.db.mapper.StudentMapper;
import ${package}.db.model.StudentModel;
import ${package}.entities.Student;
import ${package}.usecases.adapter.StudentAdapter;

public class StudentAdapterImpl implements StudentAdapter {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student findByName(String name) {
    StudentModel findByName = studentRepository.findByName(name);

    return StudentMapper.toEntity(findByName);
  }
}
