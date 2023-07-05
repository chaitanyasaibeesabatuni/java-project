package passengers;

import java.util.*;

public class IndexPage{
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Registration rg=new Registration();
		
		while (true) {
		
			System.out.println("Press '1' to Register , '2' to Login : 1/2 ?");
			int num=sc.nextInt();sc.nextLine();
			
			if (num==1) {
				
				System.out.println();
				
				rg.helper();
				
			}
			
			else if (num==2) {
				
				System.out.println("Enter you credentials !!!");
				
				rg.loginhelper();
			}
			
			else {
				System.out.println("Select valid number");
			}
			sc.nextLine();
			
		}
	}
}