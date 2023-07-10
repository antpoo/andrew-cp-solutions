import java.util.*;

public class J1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int p = 5 * b - 400;
		System.out.println(p);
		if (p > 100) System.out.print(-1);
		else if (p < 100) System.out.print(1);
		else System.out.print(0);
		
	}

}