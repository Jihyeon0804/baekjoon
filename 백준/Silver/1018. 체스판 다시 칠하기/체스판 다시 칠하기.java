import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 시작색이 W, B 두 가지 경우 모두 확인
                int repaintW = countRepaint(board, i, j, 'W');
                int repaintB = countRepaint(board, i, j, 'B');

                // 최소 칠하는 횟수 갱신
                min = Math.min(min, Math.min(repaintW, repaintB));
            }
        }

        System.out.println(min);
    }

    public static int countRepaint(char[][] board, int i, int j, char startColor) {
        int cnt = 0;

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {

                char expectedColor;
                if ((x + y) % 2 == 0) {
                    expectedColor = startColor;
                } else {
                    expectedColor = (startColor == 'W') ? 'B' : 'W';
                }

                if (board[i + x][j + y] != expectedColor) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}