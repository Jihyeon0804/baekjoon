import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = String.valueOf(n).length();

        for (int i = Math.max(n - 9 * len, 1); i < n; i++) {
            int temp = i;
            int sum = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == n) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}