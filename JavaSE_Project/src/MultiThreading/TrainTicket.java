package MultiThreading;

 class BookTrainTicket{
	 int total_tickets = 10;
	 
	   void book(int ticket) throws Exception {
		  
		  
		  // synchronized block, to reduce the waiting time for the other threads, to make it fast, to ignore some extra program
		  
		  synchronized(this) {
			  if(ticket<=total_tickets) {
					 System.out.println(ticket+" Tickets Booked Succcesfully for : "+ Thread.currentThread().getName());
					 total_tickets = total_tickets - ticket;
					 System.out.println("Total Left Tickets: "+ total_tickets);
				 }
				 
				 else {
					
					 throw new Exception(ticket+ " Tickets are not Available for "+Thread.currentThread().getName());
				 }
		  }
		 
		 
		 
		 
	 }
	 
 }


public class TrainTicket extends Thread{

	     private static BookTrainTicket b;
	     int n;
         public void run() {
		   try {
			   b.book(n);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   finally {
			   System.out.println("Finally Called...");
		   }
		   
	}
	
	public static void main(String[] args) {
		
	      b = new BookTrainTicket();
	      TrainTicket t1 = new TrainTicket();
	      t1.n = 5;
	      t1.setName("VISHNU");
	      t1.start();
//	      try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	      TrainTicket t2 = new TrainTicket();
	      t2.n = 7;
	      t2.setName("GAURAV");
	      
	      t2.start();
	      
	}
	
}
