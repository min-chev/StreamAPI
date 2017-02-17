import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ExcellentStudents {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = Main.getStudentsData();

        studentList.stream()
                .filter(s -> s.getGrades().contains(6))
                .forEach(s -> {
                            System.out.print(s.getFirstName() + " " + s.getLastName() + " ");
                            s.getGrades().stream()
                                    .sorted(Comparator.reverseOrder())
                                    .forEach(g -> System.out.print(g + " "));
                            System.out.println();
                        }
                );


    }
}
