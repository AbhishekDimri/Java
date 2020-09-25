package Exception;

import java.util.GregorianCalendar;

public class Finalize extends GregorianCalendar {

	   public static void main(String[] args) {
	      try {
	         // create a new ObjectDemo object
	         Finalize cal = new Finalize();

	         // print current time
	         System.out.println("" + cal.getTime());

	         // finalize cal
	         System.out.println("Finalizing...");
	         cal.finalize();
	         System.out.println("Finalized.");

	      } catch (Throwable ex) {
	         ex.printStackTrace();
	      }
	   }
	}