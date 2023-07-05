package passengers;
import java.util.*;

public class Booking{
	
	String date,source,destination,status,seat,meal,book,item="Veg";
	
	public String get_status() {
		
		Random rand= new Random();
		
		int i= rand.nextInt(3);
		
		if (i==0) {
			return "Hold";
		}
		else {
			return "Confimed";
		}
	}
	

	  public  char get_char() {
	        char[] characters = {'A', 'B', 'C', 'D'};
	        
	        Random random = new Random();
	        int index = random.nextInt(characters.length);
	        
	        char randomChar = characters[index];
	        return  randomChar;
	    }
	

	
	public void bookingtickets(Registration obj,Login temp) {
		
		Booking bk=new Booking();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Press \n 1. Book Ticket \n 2. Check Ticket Status \n 3. Delete Booking \n 4. update Details \n 5. LogOut");
			int check=sc.nextInt();sc.nextLine();
			
			if (check==1) {
				
				
				
				System.out.println("Enter your Required Date to Travel in 'DD-MM-YYYY' format");
				
				date=sc.nextLine();
				
				System.out.println("Enter your Starting Location :");
				
				source=sc.nextLine();
				
				System.out.println("Enter your Dropping Location :");
				destination=sc.nextLine();
				
				System.out.println("Enter your Seat Preference , Window (W),Middle(M),Aisel (A) : press W/M/A ?");
				seat=sc.nextLine();
				
				System.out.println("Do You want meal ? : Y/N ");
				meal=sc.nextLine().toLowerCase();
				
				if (meal.equals("y")) {
					System.out.println("Do You want veg (V) or  Non-veg (N) : V/N ?");
					String mealpref=sc.nextLine().toLowerCase();	
					if (mealpref.equals("v")) {
						item="Veg";
					}
					else {
						item="NON-Veg";
					}
				}
				
				System.out.println("Do You want to confirm your ticket - Y/N ? :");
				book=sc.nextLine().toLowerCase();
				
				
				status=bk.get_status();
				

				
				if (book.equals("y")) {
					
					System.out.println();
					System.out.println("Your Ticket is Sucessfully booked !!!.. Happy Journey ...");
					System.out.println();
					System.out.println();
				
				}

				else {
					System.out.println(" Your Booking Cancelled ");
				}
				
			
			}
			else if(check==2){
					System.out.println("PNR no: "+obj.details[0]);
					System.out.println("Name : "+obj.details[1]);
					System.out.println("Travel Date : "+date);
					System.out.println("Source : "+source);
					System.out.println("Destination : "+destination);
					if(status.equals("Hold")) {
					System.out.println("Status :"+status);
					}
					else {
						Random random = new Random();
						System.out.println("Status :"+status);
						System.out.println("Seat Number : "+bk.get_char()+" "+random.nextInt(100));
					}
					System.out.println();
					System.out.println();
					if (meal.equals("y")) {
						System.out.println("Additional Info :");
						System.out.println("Meals Order : "+item);
					}
					
				}
		else if (check==5){
				System.out.println("You're Redirecting to Home Page !!!");
				break;
			}
			
		}
		
		
		
}
}
