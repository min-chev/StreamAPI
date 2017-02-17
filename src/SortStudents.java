import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class SortStudents {
    public static void main(String[] args) throws IOException{
        List<Student> list = Main.getStudentsData();

        Comparator<Student> lastAscending = (s1,s2) -> s1.getLastName().compareTo(s2.getLastName());
        Comparator<Student> total = lastAscending.thenComparing((s1,s2) -> s2.getFirstName().compareTo(s1.getFirstName()));

        list.stream()
                .sorted(total)
                .forEach(s-> System.out.println(s.getFirstName() + " " + s.getLastName()));





    }
}
