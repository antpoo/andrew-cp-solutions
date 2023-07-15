import java.util.*;
import java.io.*;

public class S4 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;

	static final int MN = 100005;
	static ArrayList<Integer>[] yesL = new ArrayList[MN], noL = new ArrayList[MN];
	static int p, q;
	static boolean foundP, foundQ, visitedP[] = new boolean[MN], visitedQ[] = new boolean[MN];

	public static void main(String[] args) throws IOException {

		int n = readInt(), m = readInt();
		for (int i=0; i<MN; i++) {
			yesL[i] = new ArrayList<>();
			noL[i] = new ArrayList<>();
		}

		for (int i=0; i<m; i++) {
			int x = readInt(), y = readInt();
			yesL[x].add(y);
			
		}

		p = readInt(); q = readInt();
		dfsp(p);
		dfsq(q);
		if (foundP) System.out.println("no");
		else if (foundQ) System.out.println("yes");
		else System.out.println("unknown");

	}

	static void dfsp(int a) {
		if (yesL[a].contains(q)) {
			foundQ = true;
			return;
		}
		if (!foundQ) {
			for (int e : yesL[a]) {
				if (!visitedP[e]) {
					visitedP[e] = true;
					dfsp(e);
				}
			}
		}
	}
	
	static void dfsq(int a) {
		if (yesL[a].contains(p)) {
			foundP = true;
			return;
		}
		if (!foundP) {
			for (int e : yesL[a]) {
				if (!visitedQ[e]) {
					visitedQ[e] = true;
					dfsq(e);
				}
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