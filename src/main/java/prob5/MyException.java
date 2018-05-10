package prob5; //package prob5
/**
 * override toString and set, extends Exception
 *
 */
public class MyException extends Exception{
	private String print=null; //initialize print
	/**
	 * set print
	 * @param print
	 */
	public MyException(String print) {
		this.print=print; //this.print is input print
	}
	/**
	 * override toString
	 */
	public String toString() {
		return this.print; //if call its name, return print
	}
}
