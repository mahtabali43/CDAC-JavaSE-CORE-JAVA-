package MultiThreading;

 class BookTheatreTicket{
	 int total_tickets = 10;
	 
	 synchronized void book(int ticket) {
		 if(ticket<=total_tickets) {
			 System.out.println(ticket+" Tickets Booked Succcesfully for "+ Thread.currentThread().getName());
			 total_tickets = total_tickets - ticket;
		 }
		 
		 else {
			 System.out.println(ticket+ " Tickets are not Available for "+Thread.currentThread().getName());
			 System.out.println("Because total left Tickets are: "+ total_tickets);
		 }
		 
	 }
	 
 }


public class TicketBooking extends Thread{

	     static BookTheatreTicket b;
	     int n;
         public void run(){
		    b.book(n);
	}
	
	public static void main(String[] args) {
		
	      b = new BookTheatreTicket();
	      TicketBooking t1 = new TicketBooking();
	      t1.n = 5;
	      t1.setName("VISHNU");
	      t1.start();
	      TicketBooking t2 = new TicketBooking();
	      t2.n = 7;
	      t2.setName("GAURAV");
	      t2.start();
	}
	
}
