/*Description: This file helps the main program run by calling on the menus and inputs.
 * @author Jashan Rai
 * @version 1.0
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trainHelper{
	private static String menu;
	private static Scanner scan;
	private static train train;
/*Description: This is the menu of the train, which allows user to input what they want.
 */
	public static void trainMenu(){
		menu="Train Depot Menu Options\n\nEnter A to Attach a train car\n"
			+"Enter R to Detach car at factory\nEnter D to Display all"
			+ " the train cars\nEnter S to Search a train car\nEnter M"
			+" to Merge to two train cars\nEnter Q to Quit\n";
		
		train = new train("car.txt");
		scan= new Scanner(System.in);
		boolean running=true;
		
		while(running){
			System.out.println(menu);
			System.out.println("Please enter your choice: ");
			String choice=scan.nextLine().toUpperCase();
			
			switch(choice){
			case "A":
				createCar();
				break;
			case "R":
				delete();
				break;
			case "D":
				train.displayTrainCars();
				break;
			case "S":
				search();
				break;
			case "M":
				merge();
				break;
			case "Q":
				running=false;
				break;
			default:
				throw new InputMismatchException("\nIncorrect Input\n");
			
			}
		}
		System.out.println("Good bye!");
	}
/*Description: This method calls on the train merging and displays all the trains before and being added.
 */
	public static void merge(){
		System.out.println("\nDisplaying The Existing Cars");
		train.displayTrainCars();
		System.out.println("\nDisplaying The New Cars");
		train.merge("update.txt");
	}
/*Description: This method asks the user what they want to search and then calls on the method.
 */
	public static void search(){
		System.out.println("\nEnter the Factory Name You Want to Search: ");
		String factName=scan.nextLine();
		System.out.println();
		train.search(factName);
	}
/*Description: This method asks the user what they want to delete and then calls on the method.
 */
	public static void delete(){
		System.out.println("\nPlease enter the Factory Name you wish to detach");
		String name=scan.nextLine();
		System.out.println();
		train.detach(name);
	}
/*Description: This method asks the user information about the new car and then calls on the method to add it.
 * 
 */
	public static void createCar(){
		String factory, stop, material;
		
		System.out.println("\nPlease enter the factory Name: ");
		factory=scan.nextLine();
		System.out.println("\nPlease enter the Stop Number: ");
		stop=scan.nextLine();
		System.out.println("\nPlease enter the material Name: ");
		material=scan.nextLine();
		train.attach(factory, Integer.valueOf(stop), material);
		System.out.println("Adding a new car - " + factory + " " + stop + " "+material);
	}
}