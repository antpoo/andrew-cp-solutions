import java.util.*;
import java.io.*;

public class J5 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer str;

    static final int MN = 100005;

    static int lowest = Integer.MAX_VALUE, step[] = new int[MN];
    static boolean reachable = true, isEnd[] = new boolean[MN];
    static ArrayList<Integer>[] adj = new ArrayList[MN];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        int n = readInt();
        for (int i=1; i<=n; i++) adj[i] = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            int m = readInt();
            if (m == 0) { 
                isEnd[i] = true;
                continue;
            }
            while (m-->0) {
                int pg = readInt();
                adj[i].add(pg);
            }
        }
        Arrays.fill(step, Integer.MAX_VALUE);
        step[1] = 1;
        q.add(1);
        while (!q.isEmpty()) {
            int curPage = q.poll();
            for (int nxt : adj[curPage]) {
                if (step[nxt] > step[curPage] + 1) {
                    step[nxt] = step[curPage] + 1;
                    q.add(nxt);
                }
            }
        }

        for (int i=1; i<=n; i++) if (step[i] == Integer.MAX_VALUE) reachable = false;
        for (int i=1; i<=n; i++) if (isEnd[i]) lowest = Math.min(lowest, step[i]);

        System.out.println(reachable ? "Y" : "N");
        System.out.println(lowest);

    }

    static String next() throws IOException {
        while (str == null || !str.hasMoreTokens())
            str = new StringTokenizer(br.readLine().trim());
        return str.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
}