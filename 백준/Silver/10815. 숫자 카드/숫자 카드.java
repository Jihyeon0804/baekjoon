import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> treeMap = new TreeMap<>();
        String[] arr = br.readLine().split(" ");

        for (String s : arr) {
            treeMap.put(s, treeMap.getOrDefault(s, 0) + 1);
        }
        
        int m = Integer.parseInt(br.readLine());
        String[] temp = new String[m];
        String[] arr2 = br.readLine().split(" ");
        int idx = 0;
        for (String s : arr2) {
            temp[idx++] = treeMap.containsKey(s) ? "1" : "0";
        }
        
        System.out.println(String.join(" ", temp));
    }
}