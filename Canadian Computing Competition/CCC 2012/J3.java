import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		    for (int a = 1; a<=K; a++) { //repeat K lines
		          for(int b = 1; b<=K; b++) {//repeat K times
		            System.out.print("*");
		          }
		          for(int c = 1; c<=K; c++) {//repeat K times
		            System.out.print("x");
		          }
		          for(int d = 1; d<=K; d++) {//repeat K times
		            System.out.print("*");
		          }
		          System.out.println();
		    }
		    for(int f = 1; f<=K; f++){
		          for(int e =1; e<=K; e++){
		             System.out.print(" ");
		          }
		          for(int e =1; e<=K; e++){
		                  System.out.print("xx");
		          }
		          System.out.println();
		    }
		    
		     for(int f = 1; f<=K; f++){
		         for(int g=1; g<=K; g++){
		         System.out.print("*");
		         }
		         for(int g=1; g<=K; g++){
		             System.out.print(" ");
		         }
		          for(int g=1; g<=K; g++){
		              System.out.print("*");
		         }
		         System.out.println();
		    
		    }

	}

}