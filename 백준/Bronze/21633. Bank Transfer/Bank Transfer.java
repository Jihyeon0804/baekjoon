import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        DecimalFormat df = new DecimalFormat("0.00");
        double charge = 0;
        if (money * 0.01 + 25 >= 2000) {
            charge = 2000;
        } else if (money * 0.01 + 25 < 100) {
            charge = 100;
        } else {
            charge = money * 0.01 + 25;
        }
        System.out.println(df.format(charge));
    }
}