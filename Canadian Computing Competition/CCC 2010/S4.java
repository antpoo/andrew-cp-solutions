import java.util.*;
import java.io.*;

public class S4 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;
	
	static final int MN = 105;

	public static void main(String[] args) throws IOException {
		
		m = readInt();
		for (int i=0; i<m; i++) {
			int e = readInt();
			corner = new int[e]; costs = new int[e];
			for (int j=0; j<e; j++) corner[j] = readInt();
			for (int j=0; j<e; j++) costs[j] = readInt();
			for (int j=0; j<e; j++) {
				int a = corner[j], b = corner[(j+1) % e], c = costs[j];
				String edg = Math.min(a, b) + " " + Math.max(a, b);
				if (!map.containsKey(edg)) map.put(edg, new ArrayList<>());
				map.get(edg).add(new pii(i, c));
			}
		}
		
		for (ArrayList<pii> arr : map.values()) {
			if (arr.size() == 1) {
				int bv = arr.get(0).f, ev = m, cost = arr.get(0).s;
				edges.add(new Edge(bv, ev, cost));
			}
			else {
				int bv = arr.get(0).f, ev = arr.get(1).f, cost = arr.get(0).s;
				edges.add(new Edge(bv, ev, cost));
			}
		}
		
		makePar();
		Collections.sort(edges);
		int cnt = 0;
		for (Edge e : edges) {
			int pb = find(e.bv);
			int pe = find(e.ev);
			if (pb == pe || e.ev == m) continue;
			union(pb, pe);
			cost1 += e.cost;
			cnt++;
			if (cnt == m-1) {
				winnable = true;
				break;
			}
		}
		
		makePar();
		cnt = 0;
		for (Edge e : edges) {
			int pb = find(e.bv);
			int pe = find(e.ev);
			if (pb == pe) continue;
			union(pb, pe);
			cost2 += e.cost;
			cnt++;
			if (cnt == m) {
				if (winnable) System.out.println(Math.min(cost1, cost2));
				else System.out.println(cost2);
				return;
			}
		}
		
		System.out.println(cost1);
		
		
	}
	

	static int m, cost1, cost2, corner[], costs[], par[] = new int[MN];
	static boolean winnable = false;
	static ArrayList<Edge> edges = new ArrayList<>();
	static HashMap<String, ArrayList<pii>> map = new HashMap<>();
	
	static void makePar() {
		for (int i=0; i<=m; i++) par[i] = i;
	}
	
	static int find(int x) {
		if (par[x] == x) return x;
		return par[x] = find(par[x]);
	}
	
	static void union(int x, int y) {
		par[x] = y;
	}
	
	static class pii {
		int f, s;
		public pii(int first, int second) {
			f = first;
			s = second;
		}
	}
	
	static class Edge implements Comparable<Edge> {
		int bv, ev, cost;
		public Edge(int bv, int ev, int cost) {
			this.bv = bv;
			this.ev = ev;
			this.cost = cost;
		}
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}
	
	
	static String next() throws IOException {
		while(str == null || !str.hasMoreTokens())	
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