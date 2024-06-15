package baekjoon;

import java.util.Scanner;

/**
 * 2차원 배열의 합
 */
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] map = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++)
                map[i][j] = sc.nextInt();
        }
        int T = sc.nextInt();

        while(T != 0) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), sum = 0;
            for(int b = x1 - 1; b < x2; b++) {
                for(int c = y1 - 1; c < y2;  c++)
                    sum += map[b][c];
            }
            System.out.println(sum);
            T--;
        }
    }
}
