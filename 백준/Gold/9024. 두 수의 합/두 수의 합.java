import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String[] arr = br.readLine().split(" ");
            int target = Integer.parseInt(arr[1]);
            int[] tc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(tc);

            int cnt = 0;
            int start = 0;
            int end = tc.length - 1;
            int diff = Integer.MAX_VALUE;
            int diffCnt = 0;

            while (start < end) {
                int current = Math.abs(target - (tc[start] + tc[end]));

                if (current < diff) {
                    diff = current;
                    diffCnt = 1;
                } else if (current == diff) {
                    diffCnt++;
                }

                if (tc[start] + tc[end] > target) {
                    end--;
                } else if (tc[start] + tc[end] < target) {
                    start++;
                } else {
                    cnt++;
                    start++;
                }
            }

            System.out.println(cnt == 0 ? diffCnt : cnt);
        }
    }
}
