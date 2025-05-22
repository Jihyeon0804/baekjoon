import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] alphArr = new int[26];
        for (int i = 0; i < 26; i++) {
            alphArr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (alphArr[idx] == -1) {
                alphArr[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphArr[i] + " ");
        }
    }
}