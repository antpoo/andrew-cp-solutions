import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 91;
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		System.out.println("The 1-3-sum is "+(A+B+C*3+D));
		
	}

}