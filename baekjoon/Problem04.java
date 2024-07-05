package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 펠린드롬
 */
public class Problem04 {

    public static void main(String[] args) throws IOException {
        Problem04 problem = new Problem04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int result = problem.reverseReader(input);
        System.out.println(result);
    }

    private int reverseReader(String input) {
        int length = input.length();
        if (length == 1) {
            return 1;
        }

        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) != input.charAt(length-i-1)) {
                return 0;
            }
        }

        return 1;
    }
}


