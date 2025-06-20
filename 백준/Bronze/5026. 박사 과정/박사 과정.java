import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                int a = Integer.parseInt(s.split("\\+")[0]);
                int b = Integer.parseInt(s.split("\\+")[1]);
                System.out.println(a + b);

            }
        }
    }
}