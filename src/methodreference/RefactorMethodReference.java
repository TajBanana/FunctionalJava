package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {
  static Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
  static Predicate<Student> studentPredicate2 = RefactorMethodReference::greaterThanGradeLevel;

  public static boolean greaterThanGradeLevel(Student student) {
    return student.getGradeLevel() >= 3;
  }

  public static void main(String[] args) {
    System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
  }
}
