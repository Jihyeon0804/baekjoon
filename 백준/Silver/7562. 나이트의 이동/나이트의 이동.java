import java.io.*;
import java.util.*;

public class Main {

    static int l;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            l = Integer.parseInt(br.readLine());
            
            int[] curr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] next = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            bfs(curr, next);
        }
    }

    static void bfs (int[] curr, int[] next) {

        Queue<int[]> queue = new LinkedList<>();

        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        queue.offer(new int[]{curr[0], curr[1]});
        int[][] chess = new int[l][l];
        chess[curr[0]][curr[1]] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curr_x = current[0];
            int curr_y = current[1];

            if (Arrays.equals(current, next)) {
                System.out.println(chess[curr_x][curr_y] - 1);
                break;
            }

            for (int i = 0; i < 8; i++) {
                int nx = curr_x + dx[i];
                int ny = curr_y + dy[i];

                if (nx >= 0 && nx < l && ny >= 0 && ny < l && chess[nx][ny] == 0) {
                    queue.add(new int[]{nx, ny});
                    chess[nx][ny] = chess[curr_x][curr_y] + 1;
                }
            }
        }
    }
}
