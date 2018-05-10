package prob3; //package prob3
/**
 * calculate pow values and throws warn to main
 *
 */
public class Powercalc {
	private int result=0; //pow value variable
	/**
	 * calculate pow values and throws warn to main
	 * 
	 * @param n
	 * @param p
	 * @return result
	 * @throws Exception
	 */
	public long power(int n, int p) throws Exception {
		if(n <0 || p<0) { //if n or p is negative
			throw new Exception("n or p should not be negative."); //throw warn upper class
		}
		else if (n==0 && p==0) { //if n and p are 0
			throw new Exception("n and p should not be zero"); //throw warn upper class
		}
		result = (int)Math.pow(n, p); //calculate pow and save it in result
		return result; //return result
	}
}
