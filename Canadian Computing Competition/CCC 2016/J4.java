import java.util.*;

public class J4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = new String[2];
		input = sc.next().split(":");
		int h = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		for (int i=0; i<120; i++) {
			if (h >= 7 && h < 10 || h >= 15 && h < 19) {
				m++;
				if (m >= 60) {
					h++;
					m -= 60;
				}
			}
			m++;
			if (m >= 60) {
				h++;
				m -= 60;
			}
			if (h >= 24) h -= 24;
		}
		
		System.out.printf("%02d", h);
		System.out.print(":");
		System.out.printf("%02d", m);
	}
}