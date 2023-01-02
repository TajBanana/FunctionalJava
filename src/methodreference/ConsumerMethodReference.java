package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReference {
  static List<Student> getAllStudents = StudentDataBase.getAllStudents();
  static Consumer<Student> studentConsumer = System.out::println;
  static Consumer<Student> studentConsumer2 = Student::printActivities;

  public static void main(String[] args) {
    //getAllStudents.forEach(studentConsumer);
    getAllStudents.forEach(studentConsumer2);
  }
}
