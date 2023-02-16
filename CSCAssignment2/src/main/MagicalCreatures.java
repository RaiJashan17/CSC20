/*@Author Jashan Rai  
* @Version 1.0
* Description: This program creates the class MagicalCreatures that can do actions
*/

package main;

public class MagicalCreatures{
	public String name;
	public String type;
	public String color;
	public int age;
	public boolean alive;
	
public MagicalCreatures(String name, String type, String color, int age){
	this.name=name;
	this.type=type;
	this.color=color;
	this.age=age;
	this.alive=true;
}
/* Description: Returns the name of the MagicalCreatures
 * @Param None
 * @Return String this.name
 */ 
public String getName(){
	return this.name;
}
/* Description: Returns the type of the MagicalCreatures
 * @Param None
 * @Return String this.type
 */ 
public String getType(){
	return this.type;
}
/* Description: Returns the color of the MagicalCreatures
 * @Param None
 * @Return String this.color
 */ 
public String getColor(){
	return this.color;
}
/* Description: Returns the age of the MagicalCreatures
 * @Param None
 * @Return int this.age
 */ 
public int getAge(){
	return this.age;
}
/* Description: Returns if the creature is alive or not
 * @Param None
 * @Return Boolean this.alive
 */ 
public boolean getAlive(){
	return this.alive;
}
/* Description: Changes the name of the MagicalCreature
 * @Param String name
 * @Return None
 */ 
public void setName(String name){
	this.name=name;
}
/* Description: Changes the type of the MagicalCreature
 * @Param String type
 * @Return None
 */ 
public void setType(String type){
	this.type=type;
}
/* Description: Sets the color of the MagicalCreatures
 * @Param String color
 * @Return None
 */ 
public void setColor(String color){
	this.color=color;
}
/* Description: Sets the age of the MagicalCreatures
 * @Param int age
 * @Return None
 */ 
public void setAge(int age){
	this.age=age;
}
/* Description: Sets the creature's alive state
 * @Param boolean alive
 * @Return None
 */ 
public void setAlive(boolean alive){
	this.alive=alive;
}
/* Description: Prints out the action when creature attempts to kill
 * @Param None
 * @Return None
 */ 
public void kill(){
	System.out.println("I do not have the license to kill");
}
/* Description: This kills the creature caused by attacks
 * @Param None
 * @Return None
 */ 
public void die(){
	this.alive=false;
}
/* Description: Prints out information about the creature
 * @Param None
 * @Return this.name,this.color,this.age
 */ 
public String toString(){
	return "My name is " + this.name + " I am the color " + this.color +" and I am " + age + " years old.";
}
}