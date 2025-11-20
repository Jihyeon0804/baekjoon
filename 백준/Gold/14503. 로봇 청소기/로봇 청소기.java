import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    // N(0) E(1) S(2) W(3)
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        while (true) {
            boolean check = false;

            // 현재 위치에서 확인
            if (map[r][c] == 0) {
                map[r][c] = -1;
                answer++;
            }
            
            // 주변 네 칸 확인
            for (int i = 0; i < 4; i++) {
                if (map[r + dx[i]][c + dy[i]] == 0) {
                    check = true;
                    break;
                }
            }
            
            if (check) { // 빈 칸인 경우
                d = (d + 3) % 4;
                if (map[r + dx[d]][c + dy[d]] == 0 && (r + dx[d]) >= 0  && (r + dx[d]) < n
                        && (c + dy[d]) >= 0 && (c + dy[d]) < m) {
                    r += dx[d];
                    c += dy[d];
                }
            } else {    // 빈 칸 없는 경우
                if (map[r + dx[(d + 2) % 4]][c + dy[(d + 2) % 4]] != 1
                        && (r + dx[(d + 2) % 4]) < n && (r + dx[(d + 2) % 4]) >=0
                        && (c + dy[(d + 2) % 4]) < m && (c + dy[(d + 2) % 4]) >=0) {
                    r += dx[(d + 2) % 4];
                    c += dy[(d + 2) % 4];

                } else {
                    break;
                }
                
            }
        }
        
        System.out.println(answer);
    }
}
