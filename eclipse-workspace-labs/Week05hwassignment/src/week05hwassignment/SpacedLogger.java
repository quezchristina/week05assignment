package week05hwassignment;
//3. implement the Logger interface
public class SpacedLogger implements Logger {

/* If the log method received “Hello” as an argument
 * , it should print H e l l o
 */
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder logResult = new StringBuilder();
		for (int i = 0; i< log.length(); i++) {
			logResult.append(log.charAt(i) + " ");
		}
		System.out.println(logResult);
	}
/*The error method should do the same, but with “ERROR:” 
 * preceding the spaced out input 
 * 
 */
	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		StringBuilder strResult = new StringBuilder();
		for (int i = 0; i <str.length(); i++) {
			strResult.append(str.charAt(i) + " ");
		}
		System.out.println("****--****");
		System.out.println("ERROR: " + strResult.toString());
	}

/*SpacedLogger should add spaces between each character of the
 *  String argument passed into its methods.
 */
	

}
