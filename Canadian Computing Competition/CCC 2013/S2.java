import java.util.*;

public class S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		int A = 0;
		int B = 0;
		int C = 0;
		int i = 0;
		
		for (; i<N; i++) {
			int w = sc.nextInt();
			if (w + A + B + C > W) break;
			C = B;
			B = A;
			A = w;
		}
		
		System.out.println(i);

	}

}