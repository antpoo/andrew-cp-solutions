import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		String S = sc.next();
		
		for (int i=0; i<S.length(); i++) {
			int s = 3*(i+1)+K;
			char c = S.charAt(i);
			int S1 = c-s;
			
			if(S1<65) {
				S1 = S1+26;
			}
			char n = (char)S1;
			
			System.out.print(n);
			
		}
		
		
		

	}

}