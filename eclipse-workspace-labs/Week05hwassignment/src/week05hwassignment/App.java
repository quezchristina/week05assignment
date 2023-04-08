package week05hwassignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* In this class instantiate an instance of each of your
 *  logger classes that implement the Logger interface.
 */

Logger log1 = new AsteriskLogger();
Logger log2 = new SpacedLogger();
		
// Test both methods on both instances, passing in
// Strings of your choice.	
log1.log("Hello");
log1.error("Hello");

System.out.println("------");

log2.log("Welcome");
log2.log("Welcome");

	}

}
