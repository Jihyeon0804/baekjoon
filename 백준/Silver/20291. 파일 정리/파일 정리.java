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

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("\\.");
            treeMap.put(arr[1], treeMap.getOrDefault(arr[1], 0) + 1);
        }

        for (String s : treeMap.keySet()) {
            System.out.println(s + " " + treeMap.get(s));
        }


    }

}