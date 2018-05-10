package prob3; //package prob3

import java.util.Scanner; //for using Scanner
/**
 * show result of pow through waring exception
 *
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powercalc powcalc = new Powercalc(); //make instance of Powercalc
		Scanner scanf = new Scanner(System.in); //make instance of Scanner
		
		int x = scanf.nextInt(); // make x and save input value in x 
		int y = scanf.nextInt(); // make y and save input value in y
		long result=0; //make result and initialize
		
		try { //start find to warn
			result = powcalc.power(x,y); //result is powcalc.power 
			System.out.println(result); //print result
		}catch(Exception e) { //if it has exception
			System.out.println(e.getMessage()); //warn exception
		}
	}
}
