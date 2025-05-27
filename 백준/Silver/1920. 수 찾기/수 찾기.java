import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");

        Set<Integer> set = new HashSet<>();
        for (String s : arr1) {
            set.add(Integer.parseInt(s));
        }

        int m = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");

        for (String s : arr2) {
            System.out.println(set.contains(Integer.parseInt(s)) ? 1 : 0);
        }
    }
}