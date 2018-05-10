package prob4; //package prob4

import java.util.Scanner; //for using Scanner
/**
 *set number in array and throw exception upper class 
 *
 */
public class Boundary {
	private int [] arr = new int[5]; //make 5 int array
	private int i=0; //array's index
	private int sample; //saved space that has input number
	
	Scanner scanf = new Scanner(System.in); //make instance of Scanner
	/**
	 * set number in array and throws ArrayIndexOutOfBoundsException
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void setarr() throws ArrayIndexOutOfBoundsException {
		System.out.print("Enter and interger: "); //print
		
		sample = scanf.nextInt(); //save input value in sample
		arr[i]=sample; //save sample in arr[i]
		
		System.out.println("arr["+i+"] <- "+sample); //print sample and arr[i]
		i++; //i++ for next index
	}
}
