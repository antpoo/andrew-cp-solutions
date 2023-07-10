import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		
		if ((A==8 || A==9) && (D==8 || D==9) && B==C) {
			System.out.println("ignore");
		}
        else {
			System.out.println("answer");
		}
		

	}

}