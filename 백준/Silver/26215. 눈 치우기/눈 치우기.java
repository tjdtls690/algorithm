import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run() throws IOException {
        br.readLine();
        final PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> li = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        pq.addAll(li);

        int cnt = 0;
        while (!pq.isEmpty()) {
            execute(pq);
            cnt++;
        }

        sb.append(cnt > 1440 ? -1 : cnt);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private void execute(final PriorityQueue<Integer> pq) {
        final Integer num1 = Optional.ofNullable(pq.poll()).orElse(-1);
        final Integer num2 = Optional.ofNullable(pq.poll()).orElse(-1);
        Stream.of(num1, num2)
                .filter(integer -> integer != -1)
                .filter(integer -> integer != 1)
                .forEach(integer -> pq.add(--integer));
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}