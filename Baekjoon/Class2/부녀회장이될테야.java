package Baekjoon.Class2;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // APT Setting
        int[][] apartBlock = new int[15][15];
        for(int i=0; i<15; i++) {
            apartBlock[i][1] = 1; // i층 1호
            apartBlock[0][i] = i; // 0층 i호
        }

        for(int i=1; i<15; i++) { // 1층 ~ 14층
            for(int j=2; j<15; j++) { // 2호 ~ 14호
                apartBlock[i][j] = apartBlock[i-1][j] + apartBlock[i][j-1];
            }
        }

        int T = in.nextInt(); // Test case
        for(int i=0; i<T; i++) {
            int k = in.nextInt(); // 층
            int n = in.nextInt(); // 호

            System.out.println(apartBlock[k][n]);
        }
    }
}