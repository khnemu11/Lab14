package prob6;  //package prob6

import java.util.Scanner; //for using Scanner
/**
 * for set,check exception,show;name,age and race
 *
 */
public class CustomID {
	private String name; //name variable
	private int age; //age variable
	private String race;//race variable
	
	Scanner scanf = new Scanner(System.in); //instance of Scanner
	/**
	 * set name with checking Exception(under 5)
	 * @throws Exception
	 */
	public void setName() throws Exception{
		System.out.print("Enter your name: "); //show start to enter
		this.name = scanf.nextLine(); // save input value in this.name
		
		if(name.length()<5) { //if name's length is under 5
			throw new Exception("Your name is short! Try again!"); //throw exception with that string
		}
	}
	/**
	 * set age with checking Exception(under 18)
	 * @throws Exception
	 */
	public void setAge() throws Exception{
		System.out.print("Enter your age: "); //show starting to enter
		this.age = scanf.nextInt(); //save input value in this.age
		
		if(this.age<18) { //if age is under 18
			throw new Exception("You are too young! Try again!"); //throw exception with that string
		}
	}
	/**
	 * set name with checking Exception(Vulcans, Romulan, Klingons)
	 * @throws Exception
	 */
	public void setRace() throws Exception{
		System.out.print("Enter your race: "); //show starting to enter
		this.race = scanf.next(); //save input value in this.race
		
		if(this.race.equals("Vulcans") || race.equals("Romulan") || race.equals("Klingons")) {	
		} //if this.race is Vulcans or Romulan or Klingons, continue
		else { //else
			throw new Exception("Human! Try again!"); //throw exception with that string
		}
	}
	/**
	 * show this name and pass
	 */
	public void showNamePass() {
		System.out.println("Name is valid"); //print pass
		System.out.println("Name: "+this.name); //print name
	}
	/**
	 * show this age and pass
	 */
	public void showAgePass() {
		System.out.println("Age is valid"); //print pass
		System.out.println("Age: "+this.age); //print age
	}
	/**
	 * show this race and pass
	 */
	public void showRacePass() {
		System.out.println("Race is valid"); //print pass
		System.out.println("Race: "+this.race); //print race
	}
	
}
