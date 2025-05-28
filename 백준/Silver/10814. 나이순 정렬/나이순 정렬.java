import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split(" ");
        }

        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s[0])));

        for (String[] s : arr) {
            System.out.println(s[0] + " " + s[1]);
        }
    }
}