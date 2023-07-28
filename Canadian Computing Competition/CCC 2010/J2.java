import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nikky = 0;
	     int nf = sc.nextInt();
	     int nb = sc.nextInt();  
	    
	     int byron = 0;
	     int bf = sc.nextInt();
	     int bb = sc.nextInt(); 
	    
	    
	     int total = sc.nextInt();
	     for (int step = 1; step<=total; step++) {
	       if (step%(nf+nb)>=1 & step%(nf+nb)<=nf) {
	         nikky++;
	       } else {
	         nikky--;
	       }
	    
	       if (step%(bf+bb)>=1 & step%(bf+bb)<=bf) { 
	         byron++;
	       } else {
	         byron--;
	       }
	     }
	       
	       if (nikky>byron) {
	         System.out.println("Nikky");
	       } else if (byron>nikky) {
	         System.out.println("Byron");
	       } else {
	         System.out.println("Tied");
	       }
	}

}