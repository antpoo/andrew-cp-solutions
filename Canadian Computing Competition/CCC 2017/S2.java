import java.util.*;

public class S2 {

	static int[] arr;
	static int a;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		a = sc.nextInt();
		arr = new int[a];

		for (int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}

		if(a%2!=0) {
			Arrays.sort(arr);
			for(int i=1;i<=a/2;i++) {
				System.out.print(arr[(a/2)-i+1]+" ");
				System.out.print(arr[(a/2)+i]+" ");	
			}
			System.out.print(arr[0]);
		}

		if(a%2==0) {
			Arrays.sort(arr);
			for(int i=0;i<a/2;i++) {
				System.out.print(arr[(a/2)-i-1]+" ");
				System.out.print(arr[(a/2)+i]+" ");
			}
		}

	}

}