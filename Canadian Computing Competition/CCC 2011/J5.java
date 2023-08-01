import java.util.*;
import java.io.*;

public class J5 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer ST;
    
    static int MN = 7;
    
    static int[] map = new int[MN];
    static int N, M;
    
	public static void main(String[] args) throws IOException {

		Arrays.fill(map, 1);
		N = readInt();
		
		for (int i=0; i<N-1; i++) {
			M = readInt(); 
			map[M] = map[M]*(1 + map[i+1]);
		}
		
		System.out.println(map[N]);

	}
	
	static String next () throws IOException {
        while (ST == null || !ST.hasMoreTokens())
            ST = new StringTokenizer(br.readLine().trim());
        return ST.nextToken();
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