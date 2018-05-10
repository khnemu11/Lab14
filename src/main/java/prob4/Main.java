package prob4;  //package prob4
/**
 * set array and warn ArrayIndexOutOfBoundsexception
 *
 */
public class Main {
	/**
	 * main class
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boundary bound = new Boundary(); //make instance of Boundary
		
		while(true) { //infinite loop
			try { //start find warn
				bound.setarr(); //run setarr
			}catch(ArrayIndexOutOfBoundsException e){ //if it has ArrayIndexOutOfBoundsexception
				System.out.println("Invalid array index access!"); //warn
				break; //break infinite loop
			}
		}
	}

}
