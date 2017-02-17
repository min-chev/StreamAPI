import java.io.IOException;
import java.util.List;

public class StudentsByFirstAndLastName {
    public static void main(String[] args)throws IOException {
        List<Student> list = Main.getStudentsData();

        list.stream()
                .filter(s-> s.getFirstName().compareTo(s.getLastName())<0)
                .forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));

    }
}
