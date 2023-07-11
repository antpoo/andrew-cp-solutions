import java.util.*;

public class J3 {
	
	static Scanner sc = new Scanner(System.in);
	static String S;
	static int ans = Integer.MIN_VALUE;

	public static void main(String[] args) {

		S = sc.next();
		
		for (int i=0; i<S.length(); i++) {
			for (int j=i; j<S.length(); j++) {
				if (S.substring(i, j+1).equals(reverse(S.substring(i, j+1)))) {
					if (ans < S.substring(i,j+1).length()) {
						ans = S.substring(i,j+1).length();
					}
				}
			}
		}

		System.out.println(ans);
		
	}
	
	public static String reverse(String S) {
		
		String reversed = "";
		for (int i=S.length()-1; i>=0; i--) {
			reversed += S.charAt(i);
		}
		return reversed;
	}

}