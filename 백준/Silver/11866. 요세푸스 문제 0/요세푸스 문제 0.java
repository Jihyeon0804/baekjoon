import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder answer = new StringBuilder();
        String[] temp = new String[n];
        int idx = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            temp[idx++] = String.valueOf(queue.poll());
        }
        answer = new StringBuilder(String.join(", ", temp));
        answer.insert(0, "<");
        answer.insert(answer.length(), ">");
        System.out.println(answer);
    }
}