import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        while (n-- > 0) {
            String[] arr = br.readLine().split(" ");
            int m = Integer.parseInt(arr[0]);
            switch (m) {
                case 1:
                    deque.addFirst(Integer.parseInt(arr[1]));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(arr[1]));
                    break;
                case 3:
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case 4:
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
                    break;
                case 8:
                    sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
