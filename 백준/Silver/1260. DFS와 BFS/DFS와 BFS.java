import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();
    static int n, m, v;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        // DFS 와 BFS
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = arr[0];
        m = arr[1];
        v = arr[2];

        int[][] nodes = new int[m][2];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] node : nodes) {
            adjList.get(node[0]).add(node[1]);
            adjList.get(node[1]).add(node[0]);
        }

        for (List<Integer> list : adjList) {
            list.sort(Comparator.naturalOrder());
        }

        visited = new boolean[n + 1];
        dfs(v);
        bw.write("\n");
        visited = new boolean[n + 1];
        bfs(v, queue);
        bw.flush();
        bw.close();
    }

    static void bfs(int start, Queue<Integer> queue) throws IOException {
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            bw.write(String.valueOf(temp));
            bw.write(" ");
            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                }
            }
        }
    }

    static void dfs(int start) throws IOException {
        bw.write(String.valueOf(start));
        bw.write(" ");
        visited[start] = true;
        for (int i : adjList.get(start)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
