import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split(" ");
            String repeat = "";
            String[] str = strArr[1].split("");
            
            for (int j = 0; j < strArr[1].length() ; j++) {
                repeat += str[j].repeat(Integer.parseInt(strArr[0]));
            }
            
            answer[i] = repeat;
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}