package streams;

import data.Student;
import data.StudentDataBase;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

  public static void main(String[] args) {
    //    student name and activities in a map
    Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
    Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

    Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                                                          .stream()
                                                          //.peek(System.out::println)
                                                          .filter(studentGpaPredicate)
                                                          .peek(System.out::println)
                                                          .filter(studentPredicate)
                                                          .collect(Collectors.toMap(Student::getName, Student::getActivities));

    LinkedList<Student> studentLinkedList = StudentDataBase.getAllStudents()
                                                           .stream()
                                                           .filter(studentGpaPredicate)
                                                           .filter(studentPredicate)
                                                           .collect(Collectors.toCollection(LinkedList::new));

    //System.out.println(studentLinkedList);
    System.out.println(studentMap);
  }
}
