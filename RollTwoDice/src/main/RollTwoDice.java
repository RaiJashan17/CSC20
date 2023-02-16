package main;
import java.util.Scanner;
import java.util.Random;
public class RollTwoDice{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Desired Sum:");
		int sum=myObj.nextInt();
		Random r = new Random();
		int x=r.nextInt(6)+1;
		int y=r.nextInt(6)+1;
		while((x+y)!=sum){
			System.out.println(x + " and "+ y + " = " +(x+y));
			x=r.nextInt(6)+1;
			y=r.nextInt(6)+1;
		}
		System.out.println(x + " and "+ y + " = " +(x+y));
	}
}

