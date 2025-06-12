import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int w = Integer.parseInt(arr[1]);
        int h = Integer.parseInt(arr[2]);
        int l = Integer.parseInt(arr[3]);
           
        int answer = (w / l) * (h / l);
        System.out.println(answer >= n ? n : answer);
    }
}