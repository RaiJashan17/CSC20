/*@author: Jashan Rai
 * @version: 1.0
 * Description: This adds the creature genie and it's specific object, wand 
 */
package main;

public class genie extends MagicalCreatures{
	public boolean wand;
	
	public genie(String name, String type, String color, int age){
		super(name, type, color, age);
		this.wand=false;
	}
	public genie(){
	super("","","",0);
	this.wand=false;
	}
/* Description: Returns the MagicalCreature toString plus a fact about genie
 * @Param None
 * @Return MagicalCreature toString + Fact that depends on if the genie has wand
 */ 
	public String toString(){
		return super.toString() + ((this.wand) ? " I eat leaves, I have a wand.":" I eat leaves, I have no wand.");
	}
	/* Description: Sets the wand to true or false
	 * @Param Boolean wand
	 * @Return None
	 */ 
	public void setWand(boolean wand){
		this.wand=wand;
	}
	/* Description: Checks if the genie does or does not have the wand 
	 * @Param None
	 * @Return Boolean this.wand
	 */ 
	public boolean getWand(){
		return this.wand;
	}
/* Description: Checks if the genie can kill and does if it can
 * @Param MagicalCreatures other
 * @Return None
*/ 
	public void kill(MagicalCreatures other){
		if (this==other){
			System.out.println("I can not kill myself.");
		}else{
			boolean elim=(this.getWand()? true : false);
			
			if (elim){
				other.die();
				System.out.println(other.name + " has been killed.");
			}else{
				System.out.println("I can not kill without my wand");
			}
		}
	}
}