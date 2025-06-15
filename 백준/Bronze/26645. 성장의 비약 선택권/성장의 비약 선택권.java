import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 206) {
            System.out.println("1");
        } else if (n < 218) {
            System.out.println("2");
        } else if (n < 229) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}