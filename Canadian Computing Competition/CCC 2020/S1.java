import java.util.*;
import java.io.*;

public class S1 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer str;
	
	static class Location implements Comparable<Location> {
		double t, p;
		public Location(double  time, double pos) {
			t = time;
			p = pos;
		}
		
		public int compareTo(Location o) {
			return (int) (this.t - o.t);
		}
	}

	public static void main(String[] args) throws IOException {
		
		
		int x = readInt();
		double ans = 0;
		Location[] readings = new Location[x];
		for (int i=0; i<x; i++) readings[i] = new Location(readInt(), readInt());
		Arrays.sort(readings);
		
		for (int i=1; i<x; i++) {
			double speed = Math.abs(readings[i].p - readings[i-1].p) / Math.abs(readings[i].t - readings[i-1].t);
			ans = Math.max(ans, speed);
		}
		
		System.out.println(ans);

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