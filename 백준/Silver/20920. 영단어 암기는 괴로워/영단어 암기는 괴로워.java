import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() >= m) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> {
            int compareNum = map.get(o2).compareTo(map.get(o1));

            if (compareNum == 0) {
                compareNum = Integer.compare(o2.length(), o1.length());
            }

            if (compareNum == 0) {
                compareNum = o1.compareTo(o2);
            }
            
            return compareNum;
        });

        System.out.println(String.join("\n", keySet));
    }
}
