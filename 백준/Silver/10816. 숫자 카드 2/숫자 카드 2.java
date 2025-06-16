import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        String[] answer = new String[Integer.parseInt(br.readLine())];
        String[] m_arr = br.readLine().split(" ");

        for (int i = 0; i < m_arr.length; i++) {
            if (map.get(m_arr[i]) == null) {
                answer[i] = String.valueOf(0);
            } else {
                answer[i] = String.valueOf(map.get(m_arr[i]));
            }
        }

        System.out.println(String.join(" ", answer));
    }
}