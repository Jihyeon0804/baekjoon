import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{i, priority});
                pq.offer(priority);
            }

            int cnt = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll();

                if (front[1] == pq.peek()) {
                    cnt++;
                    pq.poll();

                    if (front[0] == M) {
                        System.out.println(cnt);
                        break;
                    }
                } else {
                    queue.offer(front);
                }
            }
        }
    }
}