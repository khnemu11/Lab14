package prob6; //package prob6

/**
 * save name,age,race with exception
 */
public class Main {
/**
 * main class
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomID id = new CustomID(); //instance of CustomID
		
		while(true) { //infinite loop for name
			try { //start to find exception
				id.setName(); //run setName
				id.showNamePass(); //run showNamPess
				break; //escape first infinite loop
			}catch(Exception e) { //if occur exception
				System.out.println(e.getMessage()); //print its error
			}
		}
		while(true) { //infinite loop for age
			try { //start to find exception
				id.setAge(); //run setAge
				id.showAgePass(); //run showAgePass
				break; //escape second infinite loop
			}catch(Exception e) { //if occur exception
				System.out.println(e.getMessage()); //print its error
			}
		}
		while(true) { //infinite loop for race
			try { //start to find exception
				id.setRace(); //run setRace
				id.showRacePass(); //run showRacePass
				break; //escape third infinite loop
			}catch(Exception e) { //if occur exception
				System.out.println(e.getMessage()); //print its error
			}
		}
	}
}
