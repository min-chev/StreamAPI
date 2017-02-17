import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<String> doubles = Arrays.asList(reader.readLine().split("\\s+"));

        OptionalDouble res = doubles.stream()
                .filter(n -> !n.isEmpty())
                .mapToDouble(n -> Double.valueOf(n))
                .filter(n -> n % 2 == 0)
                .min();


        if (res.isPresent()) {
            System.out.printf("%.2f", res.getAsDouble());
        } else {
            System.out.println("No match");
        }

    }
}

