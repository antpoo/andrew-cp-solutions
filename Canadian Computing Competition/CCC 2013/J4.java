import java.util.Arrays;
import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int c = sc.nextInt();
		
		int arr[] = new int [c];
		
		for (int i=0; i<c; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int count = 0;
		int ans = 0;
		
		for (int i=0; i<c; i++) {
			if (count + arr[i] <= t) {
				count += arr[i];
				ans++;
			}
			else break;
		}
		
		System.out.println(ans);

	}

}