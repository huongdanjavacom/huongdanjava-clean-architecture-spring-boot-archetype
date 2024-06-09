package ${package}.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ${package}.db.StudentAdapterImpl;
import ${package}.usecases.adapter.StudentAdapter;
import ${package}.usecases.student.FindStudentByNameUseCase;

@Configuration
public class UseCaseConfiguration {

  @Bean
  FindStudentByNameUseCase findStudentByNameUseCase(StudentAdapter studentAdapter) {
    return new FindStudentByNameUseCase(studentAdapter);
  }

  @Bean
  StudentAdapter studentAdapter() {
    return new StudentAdapterImpl();
  }
}
