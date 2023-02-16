/* @author: Jashan Rai
 * @version: 1.0
 * Description: Adds the elf creature, and it's unique object, shield.
 */
package main;

public class elf extends MagicalCreatures{
	public boolean shield;
	
	public elf(String name, String type, String color, int age){
		super(name, type, color, age);
		this.shield=false;
	}
	public elf(){
		super("","","",0);
		this.shield=false;
	}
/* Description: Sets the elfs unique shield object to true or false
 * @Param Boolean shield 
 * @Return None
 */ 
	public void setShield(boolean shield){
		this.shield=shield;
		}
/* Description: Return's if the elf does have a shield or not
 * @Param None
 * @Return Boolean this.shield
 */ 
	public boolean getShield(){
		return this.shield;
	}
}