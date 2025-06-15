import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // 대칭 별 찍기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(((2*n - 1) - (2*i - 1))/2));
            System.out.print("*".repeat(2*i - 1));
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            System.out.print(" ".repeat(((2*n - 1) - (2*i - 1))/2));
            System.out.print("*".repeat(2*i - 1));
            if (i != n) {
                System.out.println();
            }
        }
    }
}
