import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push_front" -> deque.addFirst(arr[1]);
                case "push_back" -> deque.addLast(arr[1]);
                case "pop_front" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                }
                case "pop_back" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                }
                case "size" -> System.out.println(deque.size());
                case "empty" -> System.out.println(deque.isEmpty() ? 1 : 0);
                case "front" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                }
                case "back" -> {
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                    }
                }
            }
        }

    }
}