import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp = "";

        while (!(temp = br.readLine()).equals("0")) {
            String[] arr = temp.split(" ");
            int n = Integer.parseInt(arr[0]);
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                list.add(Integer.parseInt(arr[i]));
            }

            combi(list, new ArrayList<>(), 6, 0);
            bw.newLine();


        }
        bw.flush();
        bw.close();

    }

    static void combi(List<Integer> myList, List<Integer> list, int target, int start) throws IOException {
        if (list.size() == target) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i < list.size() - 1) sb.append(' ');
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        for (int i = start; i < myList.size(); i++) {
            list.add(myList.get(i));
            combi(myList, list, target, i + 1);
            list.remove(list.size() - 1);
        }
    }
}