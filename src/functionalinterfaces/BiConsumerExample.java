package functionalinterfaces;

import data.Student;

import java.util.List;
import java.util.function.BiConsumer;

import static data.StudentDataBase.getAllStudents;

public class BiConsumerExample {
    private static final List<Student> studentList = getAllStudents();

    public static void main(String[] args) {
        //BiConsumer<String, String> biConsumer = (s, s2) -> System.out.println("s: " + s + " s2: " + s2);
        //biConsumer.accept("AAAA", "BBBB");
        nameAndActivities();
    }

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> printNameAndActivities = (name, activities) -> {
            System.out.print("name: " + name);
            System.out.println("   activities: " + activities);
        };

        studentList.forEach(student -> printNameAndActivities.accept(student.getName(), student.getActivities()));
    }

}