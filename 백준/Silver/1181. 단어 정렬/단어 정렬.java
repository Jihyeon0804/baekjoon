import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
           arr[i] = br.readLine();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();

            } else {
                return o1.compareTo(o2);
            }
        });

        // 순서 유지하면서 중복 제거
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        for (String s : set) {
            System.out.println(s);
        }
    }
}