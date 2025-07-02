import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] maxArr = new int[n + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        maxArr[0] = arr[0];
        if (n == 1) {
            maxArr[1] = arr[1];
        } else if (n == 2) {
            maxArr[1] = arr[1];
            maxArr[2] = arr[1] + arr[2];
        } else {
            maxArr[1] = arr[1];
            maxArr[2] = arr[1] + arr[2];
            for (int i = 3; i < maxArr.length; i++) {
                int a = maxArr[i - 2] + arr[i];
                int b = maxArr[i - 3] + arr[i - 1] + arr[i];
                maxArr[i] = Math.max(a, b);
            }
        }
        System.out.println(maxArr[n]);
    }
}