import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int T = Integer.parseInt(arr[0]);
        int X = Integer.parseInt(arr[1]);

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int student_n = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split(" ");
            for (String s : temp) {
                if (s.equals(Integer.toString(X))) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt == N ? "YES" : "NO");

    }
}