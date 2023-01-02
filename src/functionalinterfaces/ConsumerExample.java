package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    private static final Consumer<Student> studentConsumer = student -> System.out.println(student);
    private static final Consumer<Student> studentNameConsumer = student -> {
        System.out.print(student.getName());
    };
    private static final Consumer<Student> studentActivitiesConsumer = student -> {
        System.out.println(student.getActivities());
    };

    private static final List<Student> studentList = getAllStudents();

    public static void main(String[] args) {
        //printName();
        //printNameAndActivities();
        printNameAndActivitiesWithCondition();
    }

    private static List<Student> getAllStudents() {
        return StudentDataBase.getAllStudents();
    }

    static void printName() {
        studentList.forEach(studentConsumer);
    }

    static void printNameAndActivities() {
        studentList.forEach(studentNameConsumer.andThen(studentActivitiesConsumer));
    }

    static void printNameAndActivitiesWithCondition() {
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3.9) {
                studentNameConsumer.andThen(studentActivitiesConsumer).accept(student);
            }
        });
    }
}


