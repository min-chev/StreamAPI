import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class StudentsByGroup {
    public static void main(String[] args) throws IOException{
        List<Student> list = Main.getStudentsData();

        list.stream()
                .filter(s-> s.getGroup() ==2)
                .sorted((s1,s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
                .forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));

    }
}
