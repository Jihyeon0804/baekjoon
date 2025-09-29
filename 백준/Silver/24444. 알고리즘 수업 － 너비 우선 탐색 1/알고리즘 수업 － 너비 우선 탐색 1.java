import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean[] visited = new boolean[arr[0] + 1];
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i <= arr[0]; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < arr[1]; i++) {
            int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjList.get(nodes[0]).add(nodes[1]);
            adjList.get(nodes[1]).add(nodes[0]);
        }

        for (List<Integer> integers : adjList) {
            integers.sort(Comparator.naturalOrder());
        }

        int[] answer = new int[arr[0] + 1];
        int cnt = 1;

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(arr[2]);
        visited[arr[2]] = true;
        answer[arr[2]] = cnt++;

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    myQueue.add(a);
                    visited[a] = true;
                    answer[a] = cnt++;
                }
            }
        }

        for (int i = 1; i <= arr[0]; i++) {
            System.out.println(answer[i]);
        }
    }
}
