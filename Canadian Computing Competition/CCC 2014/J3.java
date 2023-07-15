import java.util.*;

public class J3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int countA = 100;
		int countD = 100;
		
		for (int i=0; i<n; i++) {
			int A = sc.nextInt();
			int D = sc.nextInt();
			if (A<D) {
				countA-=D;
			}
			if (D<A) {
				countD-=A;
			}
		}
		
		System.out.println(countA);
		System.out.println(countD);
			
	}

}