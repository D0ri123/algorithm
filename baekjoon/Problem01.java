package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 색종이
 */
public class Problem01 {
    public static void main(String[] args) throws IOException {
        Problem01 problem = new Problem01();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int n = Integer.parseInt(br.readLine());
        boolean[][] result = new boolean[101][101];
        boolean[][] mock = new boolean[3][3];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j=x; j<x+10; j++) {
                for (int k=y; k<y+10; k++) {
                    if (!result[j][k]) {
                        result[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
