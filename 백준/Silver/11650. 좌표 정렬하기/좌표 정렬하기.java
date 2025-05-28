import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] arr= new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            arr[i] = temp;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (Objects.equals(o1[0], o2[0])) {
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            }
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        });


        for (String[] s : arr) {
            System.out.println(Integer.parseInt(s[0]) + " " + Integer.parseInt(s[1]));
        }
    }
}