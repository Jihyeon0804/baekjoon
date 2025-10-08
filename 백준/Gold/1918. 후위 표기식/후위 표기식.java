import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        
        Map<String, Integer> map = new HashMap<>();
        map.put("*", 0);
        map.put("/", 0);
        map.put("+", 1);
        map.put("-", 1);
        map.put("(", 2);

        StringBuilder sb = new StringBuilder();

        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            if (Character.isAlphabetic(s.charAt(0))) {
                sb.append(s);

            } else if (s.equals("(")) {
                stack.push(s);

            } else if (s.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                while(!stack.isEmpty() &&  map.get(s) >= map.get(stack.peek())) {
                    sb.append(stack.pop());
                }

                stack.push(s);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
