import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Student> getStudentsData() throws IOException {
        Path dataPath = Paths.get("StudentData.txt");
        List<String> data = Files.readAllLines(dataPath);

        List<Student> students = new ArrayList<>();
        for (int i = 1; i < data.size(); i++) {
            String[] tokens = data.get(i).split("\\s+");

            String dacNum = tokens[0];
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Integer age = Integer.valueOf(tokens[4]);
            Integer group = Integer.valueOf(tokens[5]);
            String phone = tokens[10];


            Student student = new Student(dacNum,
                    firstName,
                    lastName,
                    email,
                    age,
                    group,
                    phone

            );

            for (int gradeInd = 6; gradeInd <= 9 ; gradeInd++) {
                Integer grade = Integer.valueOf(tokens[gradeInd]);

                student.getGrades().add(grade);
            }
            students.add(student);
        }
        return students;

    }
}
