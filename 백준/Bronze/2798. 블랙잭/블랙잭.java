import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        String[] nums = br.readLine().split(" ");
        int[] numArr = new int[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(nums[i]);
        }

        int max = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = numArr[i] + numArr[j] + numArr[k];
                    if (sum <= m && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}