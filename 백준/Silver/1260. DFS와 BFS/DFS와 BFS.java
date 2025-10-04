import java.io.*;
import java.util.*;

public class Main {

    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int n, m, v;
    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // DFS 와 BFS
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = arr[0];
        m = arr[1];
        v = arr[2];

        adjList = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int[] node = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjList.get(node[0]).add(node[1]);
            adjList.get(node[1]).add(node[0]);
        }

        for (List<Integer> list : adjList) {
            list.sort(Comparator.naturalOrder());
        }

        visited = new boolean[n + 1];
        dfs(v);

        visited = new boolean[n + 1];
        bfs(v);

        bw.write(sb1.toString() + "\n");
        bw.write(sb2.toString());
        bw.flush();
        bw.close();
    }

    static void bfs(int start) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            sb2.append(temp).append(" ");

            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                }
            }
        }
    }

    static void dfs(int start) throws IOException {
        sb1.append(start).append(" ");
        visited[start] = true;

        for (int i : adjList.get(start)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
