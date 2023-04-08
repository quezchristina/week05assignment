package week05hwassignment;
//3. implement the Logger interface
public class AsteriskLogger implements Logger {
	
	/* Create log method
	 * AsteriskLogger should print out the String it
	 *  receives between 3 asterisks on either side of the 
	 *  String (e.g. if the String passed in is 
	 *  “Hello”, then it should print ***Hello*** to the 
	 *  console).
	 */
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}
/*  error method on the AsteriskLogger
 * print the String it receives inside a box of asterisks,
 *  with the String preceded by the word “ERROR:”. 
 */
	@Override
	public void error (String strerror) {
		// TODO Auto-generated method stub
		String error = "Error: " + strerror;
		int length = error.length() + 5;
		StringBuilder sentence = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			sentence.append('*');
		}
		System.out.println(sentence.toString());
		log(error);
		System.out.println(sentence.toString());
	}


	
}
