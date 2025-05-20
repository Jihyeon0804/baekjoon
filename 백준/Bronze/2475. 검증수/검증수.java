import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int sum = 0;

        for (String s : str) {
            sum += (int) Math.pow(s.charAt(0) - '0', 2);
        }

        System.out.println(sum % 10);
    }
}