import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);

        int cnt = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        int[] intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int num : intArr) {
            int idx = 0;
            for (int q : queue) {
                if (q == num) {
                    break;
                }
                idx++;
            }

            if (idx <= queue.size() / 2) {
                for (int i = 0 ; i < idx; i++) {
                    queue.addLast(queue.poll());
                    cnt++;
                }
            } else {
                for (int i = 0; i < queue.size() - idx; i++) {
                    queue.addFirst(queue.pollLast());
                    cnt++;
                }
            }

            queue.poll();
        }
        System.out.println(cnt);
    }
}
