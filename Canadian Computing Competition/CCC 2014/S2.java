import java.util.*;

public class S2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		String[] group1 = new String[n], group2 = new String[n];
		for (int i=0; i<n; i++) group1[i] = sc.next();
		for (int i=0; i<n; i++) group2[i] = sc.next();
		
		for (int i=0; i<n; i++) {
			if (group1[i].equals(group2[i])) {
				System.out.println("bad");
				return;
			}
			map1.put(group1[i], group2[i]);
			map2.put(group2[i], group1[i]);
		}
		
		for (String name : map1.values()) {
			if (!map2.get(name).equals(map1.get(name))) {
				System.out.println("bad");
				return;
			}
		}
		
		System.out.println("good");
		
	}

}