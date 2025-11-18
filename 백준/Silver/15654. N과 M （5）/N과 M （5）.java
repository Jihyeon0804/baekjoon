import java.io.*;
import java.util.*;

public class Main {

    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        String[] arr2 = br.readLine().split(" ");

        List<Integer> myList = new ArrayList<>();
        for (String s : arr2) {
            myList.add(Integer.parseInt(s));
        }

        Collections.sort(myList);

        boolean[] visited = new boolean[n + 1];

        permu(myList, new ArrayList<>(), m, visited);

        bw.flush();
        bw.close();

    }

    static void permu(List<Integer> myList, List<Integer> list, int target, boolean[] visited) throws IOException {
        if (list.size() == target) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i < list.size() - 1) sb.append(' ');
            }
            bw.write(sb.toString());
            bw.newLine();
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(myList.get(i));
                permu(myList, list, target, visited);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
