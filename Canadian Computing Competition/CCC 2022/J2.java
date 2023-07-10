import java.util.*;
import java.io.*;

public class J2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int score[] = new int[n];
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			score[i] = 5 * a - 3 * b;
		}
		int ans = 0;
		for (int i=0; i<n; i++) {
			if (score[i] > 40)
				ans++;
		}
		
		if (ans == n)
			System.out.println(ans + "+");
		else
			System.out.println(ans);

	}

}