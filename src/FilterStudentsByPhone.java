import java.io.IOException;
import java.util.List;

public class FilterStudentsByPhone {
    public static void main(String[] args) throws IOException{
        List<Student> studentList = Main.getStudentsData();

        studentList.stream()
                .filter(s->s.getPhone().startsWith("02")||s.getPhone().startsWith("+3592"))
                .forEach(s-> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getPhone()));


    }
}
