import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i <= arr[0]; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < arr[1]; i++) {
            int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjList.get(nodes[0]).add(nodes[1]);
            adjList.get(nodes[1]).add(nodes[0]);
        }

        for (int i = 1; i <= arr[0]; i++) {
            adjList.get(i).sort(null);
        }

        int[] answer = new int[arr[0] + 1];
        int cnt = 1;

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(arr[2]);
        answer[arr[2]] = cnt++;

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            for (int a : adjList.get(temp)) {
                if (answer[a] == 0) {
                    myQueue.add(a);
                    answer[a] = cnt++;
                }
            }
        }

        for (int i = 1; i <= arr[0]; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.print(sb);
    }
}
