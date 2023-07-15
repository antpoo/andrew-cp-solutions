import java.util.*;
import java.io.*;

public class S2 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static int MJ = 1000005;
    static int[] jerseys = new int[MJ];
    static int J, A, ans = 0, reqSize, reqNum;
    static char curJ, reqJ;

	public static void main(String[] args) throws IOException {

		J = readInt();
		A = readInt();
		
		for (int i=1; i<=J; i++) {
			curJ = readCharacter();
			if (curJ == 'S') {
				jerseys[i] = 0;
			}
			else if (curJ == 'M') {
				jerseys[i] = 1;
			}
			else if (curJ == 'L') {
				jerseys[i] = 2;
			}
		}
		
		for (int i=1; i<=A; i++) {
			reqJ = readCharacter();
			if (reqJ == 'S') {
				reqSize = 0;
			}
			else if (reqJ == 'M') {
				reqSize = 1;
			}
			else if (reqJ == 'L') {
				reqSize = 2;
			}
			reqNum = readInt();
			
			if (reqSize <= jerseys[reqNum] && jerseys[reqNum] != -1) {
				ans++;
				jerseys[reqNum] = -1;
			}
		}
		
		System.out.println(ans);

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