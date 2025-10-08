import java.io.*;
import java.util.*;

public class Main {

    static int[] visited;
    static int f;
    static int s;
    static int g;
    static int u;
    static int d;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        f = arr[0];
        s = arr[1];
        g = arr[2];
        u = arr[3];
        d = arr[4];

        visited = new int[f + 1];

        bfs();
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = 1;

        while(!queue.isEmpty()) {

            int curr = queue.poll();

            if (curr == g) {
                System.out.println(visited[curr] - 1);
                return;
            }

            int upstairs = curr + u;
            if (upstairs <= f && visited[upstairs] == 0) {
                visited[upstairs] = visited[curr] + 1;
                queue.offer(upstairs);
            }

            int downstairs = curr - d;
            if (downstairs >= 1 && visited[downstairs] == 0) {
                visited[downstairs] = visited[curr] + 1;
                queue.offer(downstairs);
            }
        }

        System.out.println("use the stairs");
    }
}
