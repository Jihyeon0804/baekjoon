import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; true; i++) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            System.out.println(isBalanced(s));

        }
    }

    public static String isBalanced(String s) {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");

        s = s.replaceAll("[^()\\[\\]]", "");
        Stack<String> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            String str = String.valueOf(ch);
            if (map.containsKey(str)) {
                if (!stack.isEmpty() && stack.peek().equals(map.get(str))) {
                    stack.pop();
                } else {
                    stack.add(str);
                }
            } else {
                stack.add(str);
            }
        }

        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}