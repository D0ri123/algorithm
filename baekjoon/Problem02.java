package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * 미로 탐색
 */
public class Problem02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        int[][] dist = new int[n][m];
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        Queue<Pair> q = new LinkedList<>();

        for (int i=0; i<n; i++) {
            String input = br.readLine();
            for (int j=0; j<m; j++) {
                arr[i][j] = input.charAt(j);
                dist[i][j] = -1;
            }
        }

//        스트림 API를 사용했을 경우에
//        IntStream.range(0, n).forEach(i -> {
//            try {
//                String input = br.readLine();
//                IntStream.range(0, m).forEach(j -> {
//                    arr[i][j] = input.charAt(j);
//                    dist[i][j] = -1;
//                });
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });

        q.offer(new Pair(0, 0));
        dist[0][0] = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();

            for (int i=0; i<4; i++) {
                int nx = p.getX() + dx[i];
                int ny = p.getY() + dy[i];

                if (ny < 0 || ny >= m || nx < 0 || nx >= n) {
                    continue;
                }

                if (arr[nx][ny] == '0' || dist[nx][ny] != -1) {
                    continue;
                }

                q.offer(new Pair(nx, ny));
                dist[nx][ny] = dist[p.x][p.y] + 1;
            }
        }

        System.out.println(dist[n-1][m-1] + 1);
    }

    public static class Pair {
        private final int x;
        private final int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
