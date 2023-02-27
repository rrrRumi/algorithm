package Baekjoon.Class2;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int cnt = 1;
        int sum = 1;
        while (true) {

            if(sum >= T || T == 1)
                break;

            sum += cnt * 6;
            cnt++;
        }

        System.out.println(cnt);
    }
}
