import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        boolean[] arr = new boolean[m - n + 1];
        Arrays.fill(arr, true);

        for (int i = 2; i * i <= m; i++) {
            int start = Math.max(i * i, (n + i - 1) / i * i);

            for (int j = start; j <= m; j += i) {
                arr[j - n] = false;
            }
        }
        
        if (n == 1) arr[0] = false;

        for (int i = 0; i <= m - n; i++) {
            if (arr[i]) {
                System.out.println(i + n);
            }
        }
    }
}