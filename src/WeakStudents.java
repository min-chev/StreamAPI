import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class WeakStudents {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = Main.getStudentsData();


        studentList.stream()
                .filter(s -> s.getGrades().stream()
                        .filter(g -> g <= 3).count() >= 2)
                .sorted(Comparator.comparingDouble(s2 -> s2.getGrades()
                        .stream().mapToInt(Integer::valueOf).sum()))
                .forEach(s -> {
                            System.out.print(s.getFirstName() + " " + s.getLastName() + " ");
                            s.getGrades().stream()
                                    .sorted()
                                    .forEach(g -> System.out.print(g + " "));
                            System.out.println();
                        }
                );

    }
}
