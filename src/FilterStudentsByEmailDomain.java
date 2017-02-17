import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = Main.getStudentsData();

        studentList.stream()
                .filter(s-> s.getEmail().endsWith("@gmail.com"))
                .forEach(s-> System.out.println(s.getFirstName() + " "  + s.getLastName() + " " + s.getEmail()));


    }
}
