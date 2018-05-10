package prob5; //package prob5

import java.util.Scanner; //for using Scanner
/**
 * react null string exception program
 *
 */
public class Main {
	/**
	 * main class
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in); //make instance of Scanner
		
		try { //start to find exception
			String string = scanf.nextLine(); //string is input value
			myTest(string); //run myTest
		}catch(MyException e) { //if catch MyException
			System.out.println("Inside catch blocks: "+e); //print inside~ and its toString
		}
	}
	/**
	 * find MyException
	 * 
	 * @param str
	 * @throws MyException
	 */
	static void myTest(String str) throws MyException{
		if(str.equals("null")) { //if str is null
			throw new MyException("String val is null"); //throw MyException and set String~
		}
		else { //else
			System.out.println("String val is "+str); //print String~ str value
		}
			
	}
}
