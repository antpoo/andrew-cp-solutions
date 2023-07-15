import java.util.*;

public class J3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String ans = "";
		String S = sc.next();
		for (int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			if (isConsonant(c)) {
				ans += c;
				ans += closestVowel(c);
				if (c != 'z')
					ans += isConsonant((char)(c+1)) ? (char)(c+1) : (char)(c+2);
				else ans += 'z';
			}
			else ans += c;
		}
		
		System.out.println(ans);

	}
	
	static boolean isConsonant(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return false;
		return true;
	}
	
	static char closestVowel(char c) {
		if (c <= 'c')
			return 'a';
		else if (c <= 'g')
			return 'e';
		else if (c <= 'l')
			return 'i';
		else if (c <= 'r')
			return 'o';
		return 'u';
	}

}