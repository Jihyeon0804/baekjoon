import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int y = N % H == 0 ? H : N % H;
            int x = N % H == 0 ? N / H : N / H + 1;
            
            System.out.println(y * 100 + x);
        }
        sc.close();
    }
}
