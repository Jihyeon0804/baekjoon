import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        String[] arr = br.readLine().split(" ");

        for (String s : arr) {
            int cnt = 0;
            for (int i = 1; i <= Integer.parseInt(s); i++) {
                if (Integer.parseInt(s) % i == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}