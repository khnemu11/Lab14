package prob2; //package prob2

import java.util.InputMismatchException; //for use InputMismatchException
import java.util.Scanner; //for use Scanner
/**
 * warn exception when it divides x,y
 *
 */
public class In_exception {
	private int x; //variable x
	private int y; //variable y
	
	Scanner scanf = new Scanner(System.in); //make a instance to use Scanner
	/**
	 * set x,y and warn exceptions
	 */
	public void setXY(){
		try{ //start to find exception
			System.out.print("x: "); //print x:
			x = scanf.nextInt(); //save input value in x
			System.out.print("y: "); //print y:
			y = scanf.nextInt(); //save input value in y
			System.out.print(this.x/this.y); //print x/y
		}catch(InputMismatchException e) { //if occur InputMismatchException
			System.out.println("java.util.InputMismatchException "+e.getMessage()); //print exception
		}catch(ArithmeticException e) { //if occur ArthmeticException
			System.out.println("java.util.ArthimeticException "+e.getMessage()); //print exception
		}
	}
}
