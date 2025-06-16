import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String maxKey = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                maxKey = s;
            } else if (map.get(s) == max) {
                maxKey = maxKey.compareTo(s) < 0 ? maxKey : s;
            }
        }
        System.out.println(maxKey);
    }
}