package Baekjoon.Class2;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        int N = in.nextInt(); // 카드 수
        int M = in.nextInt(); // 블랙잭
        int card[] = new int[N];

        for(int i=0; i<N; i++) {
            card[i] = in.nextInt(); // 카드에 적힌 수
        }

        // 탐색
        int sum = 0;
        for(int i=0; i<N; i++) { // 0 부터 순회
            for(int j=i+1; j<N; j++) { // i+1 부터 순회
                for(int k=j+1; k<N; k++) { // j+1 부터 순회
                    sum = card[i] + card[j] + card[k];

                    if(res < sum && sum <= M) { // 근사치보다 크고 블랙잭 보다 같거나 작은 경우
                        res = sum;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
