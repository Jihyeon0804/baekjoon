import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int idx = 0;
        
        while (x > 0) {
            x -= ++idx;
        }

        if (idx % 2 == 0) {
            System.out.println(x + idx + "/" + (1 - x));
        } else {
            System.out.println((1 - x) + "/" + (x + idx));
        }
    }
}
