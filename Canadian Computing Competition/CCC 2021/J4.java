import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int totalL = 0;
		int totalM = 0;
		int totalS = 0;
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='L') {
				totalL++;
			} else if (S.charAt(i)=='M') {
				totalM++;
			} else {
				totalS++;
			}
		}

		int lm = 0;
		int ls = 0;
		for (int i=0; i<totalL; i++) {
			if (S.charAt(i)=='M') {
				lm++;
			} else if (S.charAt(i)=='S') {
				ls++;
			}
		}

		int ml = 0;
		int ms = 0;
		for (int i=totalL; i<totalL+totalM; i++) {
			if (S.charAt(i)=='L') {
				ml++;
			} else if (S.charAt(i)=='S') {
				ms++;
			}
		}
		int sl = 0;
		int sm = 0;
		for (int i=totalL+totalM; i<S.length(); i++) {
			if (S.charAt(i)=='L') {
				sl++;
			} else if (S.charAt(i)=='M') {
				sm++;
			}
		}

		System.out.println((ls+sl+lm+ml+sm+ms    //total letter count in wrong position
				-2*(Math.min(ls, sl)+Math.min(lm, ml)+Math.min(sm, ms))  //directly swap  

				)/3*2+Math.min(ls, sl)+Math.min(lm, ml)+Math.min(sm, ms));

	}

}