import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);


		int L = sc.nextInt();

		for (int i=0; i<L; i++) {
			int N = sc.nextInt();
			String S = sc.next();
			for (int j=0; j<N; j++) {
				System.out.print(S);  
			}
			System.out.println();
		}


	}

}