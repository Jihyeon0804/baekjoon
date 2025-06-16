import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n+m; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String s : Set.copyOf(map.keySet())) {
            if (map.containsKey(s) && map.get(s) == 1) {
                map.remove(s);
            }
        }
        System.out.println(map.size());
        String[] answer = new String[map.size()];
        int i = 0;
        for (String s : map.keySet()) {
            answer[i++] = s;
        }

        Arrays.sort(answer);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}