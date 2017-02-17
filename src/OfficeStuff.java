import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OfficeStuff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());

        TreeMap<String, LinkedHashMap<String, Integer>> BigMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split("-");

            String company = line[0].substring(1).trim();
            Integer amount = Integer.valueOf(line[1].trim());
            String product = line[2].trim().substring(0, line[2].length()-2);

            BigMap.putIfAbsent(company, new LinkedHashMap<>());

            LinkedHashMap<String, Integer> smallMap = BigMap.get(company);
           if(!smallMap.containsKey(product)){
               smallMap.put(product, amount);
           }else{
               smallMap.put(product, smallMap.get(product) + amount);
           }

            BigMap.put(company, smallMap);

        }

        for (String s : BigMap.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(s).append(": ");

            for (String s1 : BigMap.get(s).keySet()) {
                sb.append(s1).append("-").append(BigMap.get(s).get(s1)).append(", ");
            }
            System.out.println(sb.substring(0, sb.length()-2));
        }

    }
}
