import java.util.*;
import java.io.*;

public class S3 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;

	static final int MN = 100005;
	static boolean[] used = new boolean[MN];
	static ArrayList<Integer> set = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {

		int G = readInt(), p = readInt();
		int ans = 0;
		for (int i=1; i<=G; i++) set.add(i);
		for (int i=1; i<=p; i++) {
			int g = readInt();
			int lo = 0, hi = set.size() - 1, id = -1;
			while (lo <= hi) {
				int mid = (lo + hi) / 2;
				int v = set.get(mid);
				if (v == g) {
					id = mid;
					break;
				}
				else if (v < g) {
					id = mid;
					lo = mid + 1;
				}
				else hi = mid - 1;
			}
			if (id != -1) {
				ans++;
				set.remove(id);
			}
			else break;
			
		}
		
		System.out.println(ans);
		

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