import java.util.*;
import java.io.*;

public class S1 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static int N, countS, countT;
    static String S;
	
	public static void main(String[] args) throws IOException {

		N = readInt();
		countS = countT = 0;
		
		for (int i=0; i<N; i++) {
			S = readLine();
			for (int j=0; j<S.length(); j++) {
				if (S.charAt(j) == 't' || S.charAt(j) == 'T') {
					countT++;
				}
				if (S.charAt(j) == 's' || S.charAt(j) == 'S') {
					countS++;
				}
			}
		}
		
		if (countT > countS) {
			System.out.println("English");
		}
		else {
			System.out.println("French");
		}

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