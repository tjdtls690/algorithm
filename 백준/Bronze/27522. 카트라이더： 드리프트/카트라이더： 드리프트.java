import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    void run () throws IOException {
        final List<User> users = new ArrayList<>();
        int[] board = {10, 8, 6, 5, 4, 3, 2, 1};
        int[] score = new int[2];

        for (int i = 0; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            users.add(new User(st.nextToken(), st.nextToken()));
        }

        Collections.sort(users);
        for (int i = 0; i < 8; i++) {
            score[users.get(i).team.equals("R") ? 0 : 1] += board[i];
        }

        sb.append(score[0] > score[1] ? "Red" : "Blue");
        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }

    static class User implements Comparable<User> {
        int m;
        int s;
        int ns;
        String team;

        public User(String time, String team) {
            final Object[] array = Arrays.stream(time.split(":")).toArray();
            this.m = Integer.parseInt(String.valueOf(array[0]));
            this.s = Integer.parseInt(String.valueOf(array[1]));
            this.ns = Integer.parseInt(String.valueOf(array[2]));
            this.team = team;
        }

        @Override
        public int compareTo(final User o) {
            if (this.m != o.m) {
                return this.m - o.m;
            } else if (this.s != o.s) {
                return this.s - o.s;
            } else {
                return this.ns - o.ns;
            }
        }
    }
}