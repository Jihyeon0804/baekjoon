import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int temp_k = k;
        float answer = 1;
        if (k == 0) {
            System.out.println(1);

        } else {
            for (int i = 0; i < k; i++) {
                answer = answer * n;
                n--;
                answer = answer / temp_k;
                temp_k--;
            }
            System.out.println(Math.round(answer));
        }
    }
}