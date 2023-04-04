package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위굴리기 {
    static int dice[] = new int[7];
    static int N, M, x, y, k;
    static int[][] map;
    static int[] dx = {1, -1, 0, 0}; // 동, 서, 남, 북
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<k; i++) {
            int direction = Integer.parseInt(st.nextToken());
            moveDice(direction);
        }

    }

    public static void moveDice(int d) {
        int nx = x + dx[d-1];
        int ny = y + dy[d-1];

        if(nx>=0 && ny>=0 && nx<M && ny<N) {
            rollDice(d);

            x = nx;
            y = ny;

            if(map[y][x]==0) {
                map[y][x] = dice[6];
            } else {
                dice[6] = map[y][x];
                map[y][x] = 0;
            }

            System.out.println(dice[3]);
        }
    }

    public static void rollDice(int d) {
        int tmp = 0;
        switch (d){
            case 1:
                tmp = dice[4];
                dice[4] = dice[2];
                dice[3] = dice[4];
                dice[2] = dice[6];
                dice[6] = tmp;
                break;
            case 2:
                tmp = dice[2];
                dice[2] = dice[3];
                dice[3] = dice[4];
                dice[4] = dice[6];
                dice[6] = tmp;
                break;
            case 3:
                tmp = dice[6];
                dice[6] = dice[5];
                dice[5] = dice[3];
                dice[3] = dice[1];
                dice[1] = tmp;
                break;
            case 4:
                tmp = dice[3];
                dice[3] = dice[5];
                dice[5] = dice[6];
                dice[6] = dice[1];
                dice[1] = tmp;
                break;
        }
    }
}
