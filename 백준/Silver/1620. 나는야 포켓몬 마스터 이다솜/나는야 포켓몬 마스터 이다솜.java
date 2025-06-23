import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Map<String, Integer> mapName = new HashMap<>();
        Map<Integer, String> mapNumber = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            mapName.put(name, i + 1);
            mapNumber.put(i + 1, name);
        }

        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            if (temp.matches("\\d+")) {     // 숫자인지 확인
                System.out.println(mapNumber.get(Integer.parseInt(temp)));
            } else {
                System.out.println(mapName.get(temp));
            }

        }
    }
}