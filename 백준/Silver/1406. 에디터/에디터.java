import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());
        int idx = sb.length();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("L")) {
                if (idx != 0) {
                    idx--;
                }
            } else if (arr[0].equals("D")) {
                if (idx != sb.length()) {
                    idx++;
                }
            } else if (arr[0].equals("B")) {
                if (idx != 0) {
                    sb.deleteCharAt(idx - 1);
                    idx--;
                }
            } else if (arr[0].equals("P")){
                sb.insert(idx, arr[1]);
                idx++;
            }

        }
        System.out.println(sb);

    }
}