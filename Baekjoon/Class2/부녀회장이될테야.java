package Baekjoon.Class2;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        int T = in.nextInt(); // Test case
        for(int i=0; i<T; i++) {
            int k = in.nextInt();
            int n = in.nextInt();

            int[][] apartBlock = new int[k][n];

            // 0 Floor Setting
            for (int apart = n; apart>0; apart++) {
                apartBlock[0][n] = n+1;
            }

            System.out.println(answer);
        }
    }
}
