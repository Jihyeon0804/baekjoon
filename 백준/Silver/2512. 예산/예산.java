import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];
        String[] temp = br.readLine().split(" ");
        
        for (int i = 0 ; i < n; i++) {
            intArr[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(intArr);
        
        int total = Integer.parseInt(br.readLine());

        int answer = -1;
        int max = intArr[intArr.length - 1];
        int[] arr = new int[max];
        
        for (int i = 0; i < max; i++) {
            arr[i] = i + 1;
        }
        
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int sum = 0;
            int idx = (start + end) / 2;
            for (int num : intArr) {
                sum += Math.min(num, arr[idx]);
            }
            if (sum == total) {
                answer = idx;
                break;
            } else if (sum > total) {
                end = idx - 1;
            } else {
                start = idx + 1;
                answer = idx;
            }
        }
        System.out.println(arr[answer]);
    }
}