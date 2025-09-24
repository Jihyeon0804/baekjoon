import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long m = Long.parseLong(br.readLine());
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        List<Long> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> {
            int compareNum = map.get(o2).compareTo(map.get(o1));
            if (compareNum == 0) {
                return Long.compare(o1, o2);
            }
            return compareNum;
        });

        System.out.println(keySet.get(0));
    }
}
