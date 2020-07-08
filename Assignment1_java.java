import java.util.Scanner;
public class Passenger {  
	   int pnrnumber;
	   String passengerName;
	   String journeyDate;
	   String source;
	   String destination;
	   Scanner sc = new Scanner(System.in);
	   public void bookTicket() {
		   
		   System.out.println("Welcome from book ticket");
	   }
	   public void cancelTicket() {
		   
		   System.out.println("Sorry from cancel ticket");
		   
	   }
	   public void modifyTicket() {
		   
		   System.out.println("Hi from modify ticket");
	   }
	  
	   
	   public void displayTicketDetails() {
		   
		   System.out.println("=======Passenger Details=========");
		   System.out.println("pnrnumber : "+pnrnumber);
		   System.out.println("passengerName : "+passengerName);
		   System.out.println("journeyDate : "+journeyDate);
		   System.out.println("source : "+source);
		   System.out.println("destination : "+destination);
		   
	   }
	   
	   public void acceptPassengerDetails() {
		   System.out.println("pnrnumber : ");
		   pnrnumber =sc.nextInt();
		   System.out.println("passengerName : ");
		   passengerName = sc.next();
		   System.out.println("journeyDate : ");
		   journeyDate = sc.next();
		   System.out.println("source : ");
		   source = sc.next();
		   System.out.println("destination : ");
		   destination = sc.next();
		   
	   }
	public static void main(String[] args) {
		Passenger c = new Passenger();
		c.acceptPassengerDetails();
		c.bookTicket();
		c.cancelTicket();
		c.modifyTicket();
		c.displayTicketDetails();
	
	}

}