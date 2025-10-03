import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static BufferedWriter bw;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        n = Integer.parseInt(arr[0]);
        m = Integer.parseInt(arr[1]);

        dfs(new ArrayList<>(), 1);

        bw.flush();
        bw.close();

    }

    static void dfs(List<Integer> list, int start) throws IOException {

        if (list.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(' ');
                }
            }
            bw.write(sb.toString());
            bw.newLine();
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            dfs(list, i);
            list.remove(list.size() - 1);
        }
    }
}
