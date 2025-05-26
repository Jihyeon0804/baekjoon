import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                // 길이 순
                return s1.length() - s2.length();
            } else {
                // 사전 순
                return s1.compareTo(s2); // 사전순 비교
            }
        });

        // 순서 유지하면서 중복 제거
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        for (String s : set) {
            System.out.println(s);
        }
    }
}