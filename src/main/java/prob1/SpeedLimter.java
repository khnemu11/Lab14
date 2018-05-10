package prob1; //package prob1

import java.util.Random; //for using random
import java.util.Scanner; //for using keyboard
/**
 * about speed limit and current speed
 *
 */
public class SpeedLimter {
	private int speedLimit; //speed limit variable
	private int currentSpeed; //current speed random variable
	
	Scanner scanf = new Scanner(System.in); //make instance for using scanner
	Random rand = new Random(); //make instance for using random
	/**
	 * set speed limit and current speed
	 */
	public void setSpeedLimit() {
		System.out.print("Set the speed limit, officer: "); //print that sentence
		this.speedLimit=scanf.nextInt(); //set speedLimit to inputed number
		this.currentSpeed=rand.nextInt(101); //set currentSpeed to random number
	}
	/**
	 * to warn if currentSpeed is higher than speedLimit 
	 */
	public void warnSpeedLimit() {
		try { //start find exception
			if (this.currentSpeed > this.speedLimit) { //if currentSpeed is higher than speedLimit
				throw new SpeedException(); //throw Exception
			}
			else { //else
				System.out.println("You are a law abiding citizen!"); //print it doesn't have exception
			}
		}catch(SpeedException e){ //catch SpeedException to e 
			System.out.println("Speed Limit "+this.speedLimit+"km exceeded!"); //print speedLimit
			System.out.println("You are being fined."); //print that sentence
		}finally { //must do when all try~catch finish
			System.out.println("Your current speed: "+this.currentSpeed); //show current speed
		}
		
	}
}
