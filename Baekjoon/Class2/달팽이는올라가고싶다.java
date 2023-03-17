package Baekjoon.Class2;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); // .낮
        int B = in.nextInt(); // 밤
        int V = in.nextInt(); // 나무 높이
        int h = 0;
        int answer = 0;

        while(true) {

            answer++;

            h += A;
            if(h >= V) {
                break;
            }

            h -= B;
        }

        System.out.println(answer);
    }
}
