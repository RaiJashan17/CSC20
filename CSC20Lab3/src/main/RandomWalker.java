/* @Author Jashan Rai 
 * @Version 1.0
 * Description: This program gives a RandomWalker commands
 */
package main;

import java.util.Random; //Imports random

public class RandomWalker{ // Creates the class RandomWalker
	public int X = 0; //Sets the steps in x direction to zero
	public int Y= 0; // Sets the steps in y direction to zero
	public int STEPS=0; //Sets the amount of steps to zero

/*//@Param no parameters
 * @Return no return
 * Description: Moves the robot by one in any direction
 */ 
public void move(){ 
	Random rand=new Random(); // Creates new random object
	int action=rand.nextInt(4)+1; // action keeps random number for if statements
	if(action==1){// If action=1, move right
		X++;
		STEPS++;
	}if(action==2){//If action=2, move up
		Y++;
		STEPS++;
	}if (action==3){// If action=3, move left
		X--;
		STEPS++;
	}if (action==4){// If action 4, move down
		Y--;
		STEPS++;
	}
}
/* @Param no parameters
 * @Return int x
 * Description: Gets the steps taken in x direction
 */ 
public int getX(){
	return X; 
}
/* @Param no parameters
 * @Return int y
 * Description: Gets the steps taken in y direction
 */ 
public int getY(){
	return Y; 
}
/* @Param no parameters
 * @Return int STEPS
 * Description: Gets the steps that robot takes in any direction
 */ 
public int getSteps(){
	return STEPS; 
}
}