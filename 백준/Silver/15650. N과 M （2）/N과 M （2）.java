import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            myList.add(i);
        }

        comb(myList, new ArrayList<>(), m, 0);

        bw.flush();
        bw.close();

    }

    static void comb(List<Integer> myList, List<Integer> list, int target, int start) throws IOException {
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
        for (int i = start; i < myList.size(); i++) {
            list.add(myList.get(i));
            comb(myList, list, target, i + 1);
            list.remove(list.size() - 1);
        }
    }
}