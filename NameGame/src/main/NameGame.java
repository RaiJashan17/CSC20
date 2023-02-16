//NameGame
//Jashan Rai
//CSC 20

package main;
import java.util.Scanner;
public class NameGame{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Type in your first and last name");
		String name= myObj.nextLine();
		String[] splited = name.split("\\s+");
		String suffix= splited[0].substring(1);
		String suffix2= splited[1].substring(1);
		System.out.println(splited[0]+ ", " + splited[0]+ ", bo-B" + suffix);
		System.out.println("Banana-fana fo-" + splited[0]);
		System.out.println("Fee-fi-mo-M" + suffix);
		System.out.println(splited[0].toUpperCase()+"!");
		
		System.out.println(splited[1]+ ", " + splited[1]+ ", bo-B" + suffix);
		System.out.println("Banana-fana fo-" + splited[1]);
		System.out.println("Fee-fi-mo-M" + suffix2);
		System.out.println(splited[1].toUpperCase()+"!");
	}
}