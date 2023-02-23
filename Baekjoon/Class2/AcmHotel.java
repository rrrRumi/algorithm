package Baekjoon.Class2;

import java.util.Scanner;

public class AcmHotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // Test Case

        for(int i=0; i<T; i++) {
            int H = in.nextInt(); // 층 수
            int W = in.nextInt(); // 방 수
            int N = in.nextInt(); // n번째 손님

            int y;
            int x;

            // 예외의 경우 생각하기!
            if(N%H==0) { // 마지막 층일 경우
                y = H * 100; // YYXX, YXX : 100의 자릿수 만들어주기
                x = N/H; // 5/5=1 → (N/H+1)=2 가 되어버리기 떄문에 N/H
            } else {
                y = (N%H) * 100;
                x = (N/H) + 1;
            }

            int roomNumber = y + x;
            System.out.println(roomNumber);
        }
    }
}
