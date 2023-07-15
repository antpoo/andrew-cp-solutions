import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Z = sc.nextInt();
		
		String X = sc.next();
		String A = X.replace("A", "");
		String B = X.replace("B", "");
		int SA = X.length()-A.length();
		int SB = X.length()-B.length();
		
		if (SA>SB) {
			System.out.println("A");
		}else if (SB>SA) {
			System.out.println("B");
		}else if (SA==SB) {
			System.out.println("Tie");
		}
		
	    
		

	}

}