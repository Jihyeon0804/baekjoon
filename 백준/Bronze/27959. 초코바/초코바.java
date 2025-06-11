import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int count = Integer.parseInt(arr[0]);
        int money = Integer.parseInt(arr[1]);

        System.out.println(100 * count >= money ? "Yes" : "No");
    }
}