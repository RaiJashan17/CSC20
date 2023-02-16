/*This program is where the phonebook interface is created and this program uses the user's input to do actions to the phonebook such as adding, sorting, and printing.
 * @author Jashan Rai
 * @version 1.0
 */
package main;

import java.io.File;
import java.util.Scanner;

public class PhoneDriver {
	private static PhoneBook phonebook;
	private static File details;
	private static String menu;
	private static Scanner scan;
	
	
	
	public static void main(String[] args) {
		phonebook=new PhoneBook(details=new File("contactdetails.txt"));
		
		menu= "Phone Book Menu\nP: Print Phonebook\nB: Sort Phonebook by First Name\nL: Sort Phonebook by Last Name\n"
				+ "S: Search Contact By Last Name\nA: Add Contact To Phonebook\nQ: Exit the program";

		scan=new Scanner(System.in);
		String choice=null;
		boolean run=true;
		while(run){
			System.out.println(menu);
			System.out.println("Pick one of the options above: ");
			choice=scan.nextLine().toUpperCase();
			switch(choice){
			
			case "P":
				print();
				break;
			case "B":
				System.out.println("Sorting By First Name\n");
				phonebook.bubbleSort();
				break;
			case "L":
				System.out.println("Sorting By Last Name\n");
				phonebook.selectionSort();
				break;
			case "S":
				search();
				break;
			case "A":
				add();
				break;
			case "Q":
				run=false;
				break;
			default:
				System.out.println("\nIncorrect Input, please try again");
				break;
			}
	}System.out.println("Have a good day!");
	}
/* This prints the contacts that are in the phonebook. 
 */
	public static void print(){
		System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","First Name","Last Name","Home Number","Office Number","Email Address");
		System.out.println(phonebook.toString());
	}
/* Using user's data, a new contact is created and added to the end of the phonebook.
 */
	public static void add(){
		String[] info=new String[5];
		System.out.println("Please enter the first name: ");
		scan=new Scanner(System.in);
		info[0]=scan.nextLine();
		System.out.println("Please enter the last name: ");
		scan=new Scanner(System.in);
		info[1]=scan.nextLine();
		System.out.println("Please enter the home number: ");
		scan=new Scanner(System.in);
		info[2]=scan.nextLine();
		System.out.println("Please enter the office number: ");
		scan=new Scanner(System.in);
		info[3]=scan.nextLine();
		System.out.println("Please enter the email address: ");
		scan=new Scanner(System.in);
		info[4]=scan.nextLine();
		Contact c=new Contact(info[0],info[1],Long.parseLong(info[2]),Long.parseLong(info[3]),info[4]);
		phonebook.add(c);
	}
/* Using user's input, the method searches for the name and returns true or false depending on result.
 */
	public static void search(){
		System.out.println("Please enter the last name you want to find: ");
		scan=new Scanner(System.in);
		String lastName=scan.nextLine();
		if(phonebook.binarySearch(lastName)==true){
			System.out.println("Contact found");
		}else{
			System.out.println("Contact not found");
		}
	}

}