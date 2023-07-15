import java.util.*;
import java.io.*;

public class S3 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;
	
	static ArrayDeque<Integer> m, b;

	public static void main(String[] args) throws IOException {

		int tc = readInt();
		while (tc-->0) {
			int cur = 1;
			boolean basg = true;
			m = new ArrayDeque<>();
			b = new ArrayDeque<>();
			int n = readInt();
			for (int i=0; i<n; i++) {
				m.add(readInt());
			}
			
			while (cur != n) {
				if (m.isEmpty() && cur != b.peekLast()) {
					basg = false;
					break;
				}
				if (!m.isEmpty() && m.peekLast() == cur) {
					m.removeLast();
					cur++;
				}
				else if (!b.isEmpty() && b.peekLast() == cur) {
					b.removeLast();
					cur++;
				}
				else if (!m.isEmpty()) {
					b.add(m.peekLast());
					m.removeLast();
				}
			}
			System.out.println(basg ? "Y" : "N");
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