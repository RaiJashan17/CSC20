/*@author: Jashan Rai
 * @version: 1.0
 * Description: This is the game file that creates a game with the creatures
 */
package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MagicalCreaturesGame{
	public static File file=new File("src/creatures.txt");
	static Scanner scan;
	public static ArrayList<MagicalCreatures> creatures=new ArrayList<MagicalCreatures>();
	public static int MOVES=50;
	public static int alive;
	//@throws Exception e when the file is not found
	public static void main(String[] args){
		String line;
		String[] temp; 	
		try{
			scan=new Scanner(file);
		}catch(Exception e){
			System.out.println("Error finding file. Ending program.");
			System.exit(0);
		}
		while (scan.hasNextLine()){
			line=scan.nextLine();
			temp=line.split(",");
		
		switch(temp[1]){
		case "Dragon":
			creatures.add(new dragon(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
			break;
		case "Goblin":
			creatures.add(new goblin(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
			break;
		case "Elf":
			creatures.add(new elf(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
			break;
		case "Genie":
			creatures.add(new genie(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
			break;
		}
		alive++;
		}
		war();
	}
/*Description: This is the part of the program that causes the creatures to fight
 * @param: None
 * @return: None
 */
	public static void war(){
		Random rand=new Random();
		int alpha=0, beta=0, i=0;
		System.out.println("How many games do you want to play for?");
		scan=new Scanner(System.in);
		MOVES=scan.nextInt();
		while (i<MOVES){
			i++;
			alpha=rand.nextInt(creatures.size());
			beta=rand.nextInt(creatures.size());
			System.out.println("Killer = " + creatures.get(alpha).getName());
			System.out.println("Victim = " + creatures.get(beta).getName());
			if("Genie".equals(creatures.get(alpha).getType())){
				System.out.println("Do you want to give genie a wand, type Y for Yes or N or no.");
				scan=new Scanner(System.in);
				String answer=scan.next();
				if("Y".equals(answer)){
					((genie)creatures.get(alpha)).setWand(true);
				}else{
					((genie)creatures.get(alpha)).setWand(false);}
				}
				if("Elf".equals((creatures.get(beta).getType()))){
					System.out.println("Do you want to give elf a shield, type Y for Yes or N or no.");
					scan=new Scanner(System.in);
					String answer2=scan.next();
					if("Y".equals(answer2)){
						((elf) creatures.get(beta)).setShield(true);
					}
					else{
						((elf)creatures.get(beta)).setShield(false);
					}
					}
				
				if("Goblin".equals(creatures.get(alpha).getType())){
					creatures.get(alpha).kill();
				}
				if("Elf".equals(creatures.get(alpha).getType())){
					creatures.get(alpha).kill();
				}
				if("Dragon".equals(creatures.get(alpha).getType())){
					((dragon)creatures.get(alpha)).kill(creatures.get(beta));
					if (creatures.get(beta).getAlive()==false){
						System.out.println("Removing the Dead");
						creatures.remove(beta);
				}
			}
				try{
					if("Genie".equals(creatures.get(alpha).getType()) && !"Dragon".equals(creatures.get(beta).getType())){
						((genie)creatures.get(alpha)).kill(creatures.get(beta));
						if (creatures.get(beta).getAlive()==false){
							System.out.println("Removing the Dead");
							creatures.remove(beta);
					}}
						if("Genie".equals(creatures.get(alpha).getType()) && "Dragon".equals(creatures.get(beta).getType())){
							((dragon)creatures.get(beta)).die();
						}
						}catch(Exception e){
							;
					}
				displayCreatures();
			}
			}
/*Description: This is the method that prints what creatures are still alive
 * @param: None
 * @return: None
 */
	public static void displayCreatures(){
		int i=0;
		System.out.println("------------------------------");
		System.out.println("Creatures still alive: " +creatures.size());
		System.out.println("------------------------------");
		for (MagicalCreatures e: creatures){
			i++;
			System.out.println(i-1 + ": " + e.toString());
		}
	}
}