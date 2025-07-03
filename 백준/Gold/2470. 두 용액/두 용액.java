import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] result = new int[2];
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        int sum = Integer.MAX_VALUE;

        while (start < end) {
            int temp = arr[start] + arr[end];
            if (Math.abs(temp) < sum) {
                sum = Math.abs(temp);
                result[0] = arr[start];
                result[1] = arr[end];
            }
            if (temp > 0) {
                end--;
            } else {
                start++;
            }
        }
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[1]);
    }
}