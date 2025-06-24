import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] temp = new int[2];
            String[] arr = br.readLine().split(" ");
            temp[0] = Integer.parseInt(arr[0]);
            temp[1] = Integer.parseInt(arr[1]);
            list.add(temp);
        }

        list.sort((o1, o2) -> Integer.compare(o1[0], o2[0]));

        int start = list.get(0)[0];
        int end = list.get(0)[1];
        int len = 0;

        for (int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            if (temp[0] <= end) {       // 겹치거나 이어지는 선
                // 완전히 포함되는 경우때문에 Math.max() 사용
                end = Math.max(end, temp[1]);
            } else {                    // 끊어지는 선
                len += end - start;
                start = temp[0];
                end = temp[1];
            }
        }
        len += end - start;
        System.out.println(len);
    }
}