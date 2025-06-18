import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String stringBuilder = String.valueOf(str.charAt(0)) +
                    str.charAt(str.length() - 1);
            System.out.println(stringBuilder);
        }
    }
}