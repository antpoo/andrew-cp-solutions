import java.util.*;
import java.io.*;

public class S3 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;

	static char[][] grid;
	static int[][] step;
	static boolean[][] camera;
	static Queue<pii> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {

		int n = readInt(), m = readInt();
		step = new int[n][m];
		grid = new char[n][m];
		camera = new boolean[n][m];
		
		pii start = null;
		for (int i=0; i<n; i++) {
			String S = next();
			if (S.contains("S")) start = new pii(i, S.indexOf('S'));
			grid[i] = S.toCharArray();
			Arrays.fill(step[i], Integer.MAX_VALUE);
		}
		
		// marking cameras
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (grid[i][j] == 'C') {
					camera[i][j] = true;
					for (int k=1; k<=i; k++) {
						if (isConveyer(grid[i-k][j])) continue;
						if (grid[i-k][j] == 'W') break; 
						camera[i-k][j] = true;
					}
					for (int k=1; k<n-i-1; k++) {
						if (isConveyer(grid[i+k][j])) continue;
						if (grid[i+k][j] == 'W') break; 
						camera[i+k][j] = true;
					}
					for (int k=1; k<=j; k++) {
						if (isConveyer(grid[i][j-k])) continue;
						if (grid[i][j-k] == 'W') break; 
						camera[i][j-k] = true;
					}
					for (int k=1; k<m-j-1; k++) {
						if (isConveyer(grid[i][j+k])) continue;
						if (grid[i][j+k] == 'W') break; 
						camera[i][j+k] = true;
					}
				}
			}
		}
		
		
		step[start.f][start.s] = 0;
		q.add(start);
		while (!q.isEmpty()) {
			pii cur = q.poll();
			int x = cur.f, y = cur.s;
			int newStep = step[x][y] + 1;
			
			if (grid[x][y] == 'D') {
				if (x < n - 1 && grid[x+1][y] != 'W' && step[x+1][y] > newStep - 1 && !camera[x+1][y]) {
					step[x+1][y] = newStep - 1;
					q.add(new pii(x+1, y));
				}
				continue;
			}
			
			if (grid[x][y] == 'U') {
				if (x > 0 && grid[x-1][y] != 'W' && step[x-1][y] > newStep - 1 && !camera[x-1][y]) {
					step[x-1][y] = newStep - 1;
					q.add(new pii(x-1, y));
				}
				continue;
			}
			
			if (grid[x][y] == 'R') {
				if (y < m - 1 && grid[x][y+1] != 'W' && step[x][y+1] > newStep - 1 && !camera[x][y+1]) {
					step[x][y+1] = newStep - 1;
					q.add(new pii(x, y+1));
				}
				continue;
			}
			
			if (grid[x][y] == 'L') {
				if (y > 0 && grid[x][y-1] != 'W' && step[x][y-1] > newStep - 1&& !camera[x][y-1]) {
					step[x][y-1] = newStep - 1;
					q.add(new pii(x, y-1));
				}
				continue;
			}
			
			if (x < n - 1 && grid[x+1][y] != 'W' && step[x+1][y] > newStep && !camera[x+1][y]) {
				step[x+1][y] = newStep;
				q.add(new pii(x+1, y));
			}
			
			if (x > 0 && grid[x-1][y] != 'W' && step[x-1][y] > newStep && !camera[x-1][y]) {
				step[x-1][y] = newStep;
				q.add(new pii(x-1, y));
			}
			
			if (y < m - 1 && grid[x][y+1] != 'W' && step[x][y+1] > newStep && !camera[x][y+1]) {
				step[x][y+1] = newStep;
				q.add(new pii(x, y+1));
			}
			
			if (y > 0 && grid[x][y-1] != 'W' && step[x][y-1] > newStep && !camera[x][y-1]) {
				step[x][y-1] = newStep;
				q.add(new pii(x, y-1));
			}
		}
		
		for (int i=0; i<n; i++) for (int j=0; j<m; j++) if (grid[i][j] == '.') System.out.println(step[i][j] == Integer.MAX_VALUE || camera[start.f][start.s] ? -1 : step[i][j]);
		
	}

	static class pii {
		int f, s;
		public pii(int first, int second) {
			f = first;
			s = second;
		}
	}
	
	static boolean isConveyer(char c) {
		return c == 'L' || c == 'R' || c == 'U' || c == 'D';
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