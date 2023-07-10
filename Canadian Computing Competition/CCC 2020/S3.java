import java.util.*;
import java.io.*;

public class S3 {
	 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;
	
	static final int BASE1 = 31, MOD1 = 1000000007, BASE2 = 57, MOD2 = 1000000009;
	static long hash1, hash2;
	static int[] freqN = new int[26], freqH = new int[26];
	static HashSet<Long> set = new HashSet<>();
	
	static boolean eq() {
		for (int i=0; i<26; i++) if (freqN[i] != freqH[i]) return false;
		return true;
	}
	
	static long fpow(int b, int p, int MOD) {
		if (p == 0) return 1;
		long half = fpow(b, p/2, MOD);
		if (p % 2 == 0) return half * half % MOD;
		else return half * half % MOD * b % MOD;
	}
	
	public static void main(String[] args) throws IOException {

		String N = next(), H = next();
		if (N.length() > H.length()) {
			System.out.println(0);
			return;
		}
		for (int i=0; i<N.length(); i++) {
			int ch = N.charAt(i) - 'a';
			freqN[ch]++;
			ch = H.charAt(i) - 'a';
			freqH[ch]++;
			hash1 = hash1 * BASE1 + ch;
			hash1 %= MOD1;
			hash2 = hash2 * BASE2 + ch;
			hash2 %= MOD2;
		}
	
		if (eq()) set.add(hash1 + hash2 * MOD1);
		
		for (int i=N.length(); i<H.length(); i++) {
			int ch = H.charAt(i) - 'a';
			freqH[ch]++;
			int oldCh = H.charAt(i - N.length()) - 'a';
			freqH[oldCh]--;
			hash1 *= BASE1;
			hash1 %= MOD1;
			hash1 -= oldCh * fpow(BASE1, N.length(), MOD1) % MOD1;
			hash1 += ch;
			hash1 %= MOD1;
			hash1 += MOD1;
			hash1 %= MOD1;
			
			hash2 *= BASE2;
			hash2 %= MOD2;
			hash2 -= oldCh * fpow(BASE2, N.length(), MOD2) % MOD2;
			hash2 += ch;
			hash2 %= MOD2;
			hash2 += MOD2;
			hash2 %= MOD2;
			
			if (eq()) set.add(hash1 + hash2 * MOD1);
		}
		
		System.out.println(set.size());
		
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