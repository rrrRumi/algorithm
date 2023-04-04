package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 시험감독 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // input
        int N = Integer.parseInt(br.readLine()); // 시험장 수
        int[] person = new int[N];
        long cnt = 0; // 응시자 범위가 1,000,000 이므로 long으로 설정

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            person[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int master = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        for(int j=0; j<N; j++) {
            person[j] -= master;
            cnt++;

            if(person[j] > 0) {
                cnt += person[j] / sub;

                if(person[j] % sub > 0) {
                   cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
