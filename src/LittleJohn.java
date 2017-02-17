import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.toBinaryString;

public class LittleJohn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int small = 0;
        int medium = 0;
        int large = 0;

        Pattern pattern = Pattern.compile("(?<small>>-{5}>)|(?<medium>>>-{5}>)|(?<large>>>>-{5}>>)");

        for (int i = 0; i < 4; i++) {
            String line = reader.readLine();

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                if (matcher.group("small") != null) {
                    small++;
                } else if (matcher.group("medium") != null) {
                    medium++;

                } else if (matcher.group("large") != null) {
                    large++;
                }
            }

        }

        Integer finalnum = Integer.valueOf(String.valueOf(small) + String.valueOf(medium) + String.valueOf(large));

        String binary1 = toBinaryString(finalnum);
        String binary2 = new StringBuilder(toBinaryString(finalnum)).reverse().toString();

        String binary3 = binary1 + binary2;

        Integer res = Integer.parseInt(binary3, 2);

        System.out.println(res);
    }
}
