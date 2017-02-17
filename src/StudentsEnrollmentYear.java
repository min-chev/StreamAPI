import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsEnrollmentYear {
    public static void main(String[] args) throws IOException{
        List<Student> students = Main.getStudentsData();

        Map<Integer, List<Student>> studentsYear = students.stream()
                .collect(Collectors.groupingBy(
                        s-> Integer.valueOf(s.getFacultyNumber().substring(s.getFacultyNumber().length()-2))));


        studentsYear.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(y-> {
                    System.out.println("20" + y.getKey() + ":");
                    y.getValue().stream()
                            .sorted(Comparator.comparing(Student::getFirstName)
                                    .thenComparing(Student::getLastName))
                            .forEach(s -> System.out.println("-- " + s.getFirstName() + " " + s.getLastName()));
                });

    }
}
