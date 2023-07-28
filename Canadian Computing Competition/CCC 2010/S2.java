import java.util.*;
import java.io.*;

public class S2 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static HashMap<String, String> convert = new HashMap<>();

	public static void main(String[] args) throws IOException {
		
		int k = readInt();
		for (int i=0; i<k; i++) {
			String first = next(), second = next();
			convert.put(second, first);
		}
		String in = next();
		String build = "";
		for (int i=0; i<in.length(); i++) {
			build += in.charAt(i);
			if (convert.containsKey(build)) {
				System.out.print(convert.get(build));
				build = "";
			}
		}
		
		System.out.println();

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