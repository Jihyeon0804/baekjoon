import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        int[] lenArr = new int[n];
        lenArr[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (lenArr[j] > max) {
                        max = lenArr[j];
                    }
                }
            }
            lenArr[i] = max + 1;
        }
        System.out.println(Arrays.stream(lenArr).max().getAsInt());
    }
}