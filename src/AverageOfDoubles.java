import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> doubl = Arrays.asList(reader.readLine().split("\\s+"));

            DoubleStream doubleStream = doubl.stream()
                    .filter(n->!n.isEmpty())
                    .mapToDouble(n -> Double.valueOf(n));

        OptionalDouble res = doubleStream.average();

        if(res.isPresent()){
            System.out.printf("%.2f", res.getAsDouble());
        }else{
            System.out.println("No match");
        }

        }

    }

