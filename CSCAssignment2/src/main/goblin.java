/*@author: Jashan Rai
 * @version: 1.0
 * Description: This adds the goblin creature, which has a specific toString and kill method
 */
package main;

public class goblin extends MagicalCreatures{
	public goblin(String name, String type, String color, int age){
		super(name, type, color, age);
	}
	public goblin(){
		super("","","",0);
	}
	/* Description: Returns the MagicalCreature toString and adds a fact
	 * @Param None
	 * @Return MagicalCreature toString + "I kill elves if they do not have shields."
	 */ 
	public String toString(){
		return super.toString() + " I kill elves if they do not have shields.";
	}
	/*Description: Checks if the goblin can kill elf and does it (Currently does not work and not needed for the assignment)
	 * @Param: I other
	 * @Return: None
	 * public <I extends elf> void kill(I other){
		boolean elim= (other.getShield()) ? false : true;
		
		if(elim){
			other.die();
		}else{
			System.out.println("Elf has a shield. I can not kill them!");
		}
	}*/
}