import java.io.IOException;
import java.util.List;

public class StudentsbyAge {
    public static void main(String[] args) throws IOException{
        List<Student> list = Main.getStudentsData();

        list.stream()
                .filter(s-> s.getAge()>=18 && s.getAge()<=24)
                .forEach(s-> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge()));

    }
}
