import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindandSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> tokens = Arrays.asList(reader.readLine().split("\\s+"));

        OptionalInt sum = tokens.stream()
                .filter(x -> isNumber(x))
                .mapToInt(Integer::parseInt)
                .reduce((x, y) -> x + y);

        if (sum.isPresent()) {
            System.out.println(sum.getAsInt());
        } else {
            System.out.println("No match");
        }

    }

    private static boolean isNumber(String x) {
        if (x.isEmpty()) {
            return false;
        }

        char[] arr = x.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] == '-') {
                    continue;
                }
            }

            if (!Character.isDigit(arr[i])) {
                return false;
            }

        }
        return true;

    }


}
