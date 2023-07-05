package passengers;
import java.util.*;

public class Registration {
	
	public String[] details=new String[6];
	
	public void setval(int i,String val,String[] details) {
		
		this.details[i]=val;
	}
	
	
	public String getval(int i){
		
		
		return this.details[i];
	}	
	
	public Long Randomgenerator() {
		
		Random rand= new Random();
		
		Long id=(long) ((rand.nextInt(999999999-158657891 +1))+158647981);
		
		return id;
		
	}
	
	public  void helper() {
		
		Scanner sc =new Scanner(System.in);
		
		Registration obj=new Registration();
		
		System.out.println("\n");
		System.out.println("Registration Page\n \n ");
		
		Long id,contact;
		
		String name,email,password,address;

		id =obj.Randomgenerator();
		
		obj.setval(0, Long.toString(id), obj.details);
		
		System.out.println("Enter Your Name :");
		
		name=sc.nextLine();
		
		obj.setval(1, name, obj.details);
		
		System.out.println("Enter Your Email Id :");
		
		email=sc.nextLine();
		obj.setval(2,email, obj.details);
		
		System.out.println("Enter Your Password :");
		
		password=sc.nextLine();	
		
		obj.setval(3, password, obj.details);
		
		System.out.println("Enter Your Address");
		
		address=sc.nextLine();
		obj.setval(4, address, obj.details);
		
		System.out.println("Enter Your Contact Number :");
		
		contact=sc.nextLong();
		sc.nextLine();
		
		obj.setval(5,Long.toString(contact), obj.details);
		
		
		
		Login lp=new Login();
		
		lp.loginpage(obj);
		
		
		
		
		
	}
	
	public void loginhelper() {
		
		Registration obj2 =new Registration();
		
		Login lp=new Login();
		
		lp.loginpage(obj2);
	}
	
	public static void main(String[] args) {
		
		Registration obj1= new Registration();
		
		obj1.helper();
		
	}

}
