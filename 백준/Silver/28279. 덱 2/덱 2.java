import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        while (n > 0) {
            String[] arr = br.readLine().split(" ");
            int m = Integer.parseInt(arr[0]);
            switch (m) {
                case 1:
                    deque.addFirst(Integer.parseInt(arr[1]));
                    n--;
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(arr[1]));

                    n--;
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    n--;
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    n--;
                    break;
                case 5:
                    System.out.println(deque.size());
                    n--;
                    break;
                case 6:
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    n--;
                    break;
                case 7:
                    System.out.println(!deque.isEmpty() ? deque.peekFirst() : -1);
                    n--;
                    break;
                case 8:
                    System.out.println(!deque.isEmpty() ? deque.peekLast() : -1);
                    n--;
                    break;
            }
        }
    }
}
