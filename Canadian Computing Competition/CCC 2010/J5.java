import java.util.*;
import java.io.*;

public class J5 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static boolean[][] visited = new boolean[9][9];
    static int[][] dist = new int[9][9];
    static int[][] moves = {{1,2},{1,-2},{-1,2},{-1,-2},{2,-1},{2,1},{-2,1},{-2,-1}};
    static LinkedList<Integer> q = new LinkedList<Integer>();
    static int bx, by, ex, ey;
    
	public static void main(String[] args) throws IOException {

		bx = readInt(); by = readInt();
		ex = readInt(); ey = readInt();
		
		dist[bx][by] = 0;
		visited[bx][by] = true;
		
		q.add(bx);
		q.add(by);
		
		while (!visited[ex][ey]) {
			int curX = q.poll();
			int curY = q.poll();
			
			for (int[] s:moves) {
				if (curX+s[0] < 1 || curY+s[1] < 1 || curX+s[0] > 8 || curY+s[1]> 8 || visited[curX+s[0]][curY+s[1]]) continue;
				
				visited[curX+s[0]][curY+s[1]] = true;
				dist[curX+s[0]][curY+s[1]] += dist[curX][curY]+1;
				q.add(curX+s[0]);
				q.add(curY+s[1]);
			}
		}
		
		System.out.println(dist[ex][ey]);

	}

	static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
	
}