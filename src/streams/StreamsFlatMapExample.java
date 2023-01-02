package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

  public static List<String> activitiesList() {
    return StudentDataBase.getAllStudents()
                          .stream()
                          .map(Student::getActivities)
                          .flatMap(List::stream)
                          .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(activitiesList());
  }
}
