import java.util.*;
import java.io.*;

public class S3 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;
	
	static ArrayList<Integer>[] adj = new ArrayList[55];
	static boolean[] vis;
	

	
	static int bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		int[] step = new int[55];
		Arrays.fill(step, Integer.MAX_VALUE);
		step[x] = 0;
		q.add(x);
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int nxt : adj[cur]) {
				if (step[nxt] > step[cur] + 1) {
					step[nxt] = step[cur] + 1;
					q.add(nxt);
				}
			}
		}
		return step[y];
	}

	public static void main(String[] args) throws IOException {
		
		for (int i=0; i<55; i++) adj[i] = new ArrayList<>();

		adj[1].add(6);adj[2].add(6);adj[3].add(4);adj[3].add(5);adj[3].add(6);
		adj[3].add(15);adj[4].add(3);adj[4].add(5);adj[4].add(6);adj[5].add(3);
		adj[5].add(3);adj[5].add(4);adj[5].add(6);adj[6].add(1);adj[6].add(2);
		adj[6].add(3);adj[6].add(4);adj[6].add(5);adj[6].add(7);adj[7].add(6);
		adj[7].add(8);adj[8].add(7);adj[8].add(9);adj[9].add(8);adj[9].add(10);
		adj[9].add(12);adj[10].add(9);adj[10].add(11);adj[11].add(10);
		adj[11].add(12);adj[12].add(9);adj[12].add(11);adj[12].add(13);
		adj[13].add(12);adj[13].add(14);adj[13].add(15);adj[14].add(13);
		adj[15].add(3);adj[15].add(13);adj[16].add(17);adj[16].add(18);
		adj[17].add(16);adj[17].add(18);adj[18].add(16);adj[18].add(17);
		
		while (true) {
			char action = readCharacter();
			if (action == 'q') break;
			else if (action == 'i') {
				int x = readInt(), y = readInt();
				adj[x].add(y);
				adj[y].add(x);
			}
			else if (action == 'd') {
				int x = readInt(), y = readInt();
				adj[x].remove(Integer.valueOf(y));
				adj[y].remove(Integer.valueOf(x));
			}
			else if (action == 'n') {
				int x = readInt();
				System.out.println(adj[x].size());
			}
			else if (action == 'f') {
				vis = new boolean[55];
				int x = readInt();
				int ans = 0;
				HashSet<Integer> f = new HashSet<>();
				for (int nxt : adj[x]) {
					for (int nei : adj[nxt]) {
						if (!adj[x].contains(nei) && nei != x) {
							f.add(nei);
						}
					}
				}
				System.out.println(f.size());
			}
			else if (action == 's') {
				
				int x = readInt();
				int y = readInt();
				
				int ans = bfs(x, y);
				if (ans == Integer.MAX_VALUE) System.out.println("Not connected");
				else System.out.println(ans);
			}
			
		}


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