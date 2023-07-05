package passengers;
import java.util.*;

public class Login{
	
	public String[] logindetails=new String[6];
	
	public void setval(int i,String val,String[] logindetails) {
		
		this.logindetails[i]=val;
	}
	
	
	public String getval(int i){
		
		
		return this.logindetails[i];
	}	
	
	public Long getloginid() {
		
		Random rand= new Random();
		
		Long id=(long) ((rand.nextInt(999999-248957 +1))+110217);
		
		return id;
		
	}
	
	public void loginpage(Registration obj) {
		
		Long Id;
		int count=0;
		String email,password,check;
		check="F";
		
		Login temp=new Login();
		Scanner sc=new Scanner(System.in);
		
		Id=temp.getloginid();
		System.out.println("\n \n");
		System.out.println("Login Page \n \n ");
		temp.setval(0,Long.toString(Id), temp.logindetails);
		
		while(true){
			
			System.out.println("Enter Your Email Address :");
			email=sc.nextLine();
			
			System.out.println("Enter Your Password : ");
			password=sc.nextLine();
			// database data retrival part
			
			
			System.out.println("Login Id :"+Id);
			
			System.out.println("Email Id :"+email);
			
			int size=password.length();
			
			System.out.print("Password :");
			
			for (int i=0;i<size;i++) {
			
				System.out.print("*");
			}
			System.out.println();
			
			
			
			// database true assume 1
			//checkingpurpose of num
			System.out.println("enter number val");
			int num=sc.nextInt();sc.nextLine();	
			
			if (num==1) {
				
				System.out.println("correct details");
				
				temp.setval(1, email, temp.logindetails);
				temp.setval(2, password, temp.logindetails);
				
				check="T";
				break;
				
			}
			else {
				count+=1;
				System.out.println("Invalid Username or Password !!!");
			}
			if (count==1) {
				System.out.println();
				System.out.println("You have one more attempt to give correct credentials \n");
			}
			
			if (count==2) {
				
				System.out.println("Sorry, You are redirecting to Home Page :( ");
				break;
				
			}
					
		}
		
		if(check.equals("T")){
			
			Booking bt=new Booking();
			bt.bookingtickets(obj,temp);
			
		}
	}
	
	
	public static void main(String[] args) {
		
	}

}