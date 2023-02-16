/*@author: Jashan Rai
 * @Version 1.0
 * Descrption: This is one of the creatures, the dragon, which has it's own set of rules.
 */
package main;

public class dragon extends MagicalCreatures{
	public dragon(String name, String type, String color, int age){
		super(name, type, color, age);
	}
	public dragon(){
		super("","","",0);
	}
/* Description: Returns information about the dragon and a fact about it
 * @Param None
 * @Return MagicalCreature toString() + "I breathe fire"
 */ 
	public String toString(){
		return super.toString() + " I breathe fire.";
	}
/* Description: States that the dragon can not die
 * @Param None
 * @Return None
 */ 
	public void die(){
		System.out.println("I am a dragon - nobody gets to kill me!");
	}
/* Description: Checks if the dragon can kill and does if it can
 * @Param MagicalCreatures other
 * @Return None
 */ 
	public void kill(MagicalCreatures other){
		if (this==other){
			System.out.println("I can not kill myself.");
		}else{
			if (other.type.equals("Dragon")){
				System.out.println("Dragons can not die");
			}else{
				if (this.age >= 40){
					other.die();
					System.out.println(other.name + " has been killed.");
				}else{
					System.out.println("I am too young to kill!");
				}
			}
		}
		
	}
}