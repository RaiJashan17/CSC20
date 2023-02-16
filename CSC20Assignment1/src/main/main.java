package main;

public class main{
	public static void main(String[] args){
		String test1= "Donald J. Trump";
		String test2= "Joesph R. Biden";
		LetterInventory inventories1 = new LetterInventory(test1);
		LetterInventory inventories2 = new LetterInventory(test2);
		System.out.println(inventories1.get('o'));
		System.out.println(inventories2.get('i'));
		System.out.println(inventories1.size());
		System.out.println(inventories2.size());
		System.out.println(inventories1.isEmpty());
		System.out.println(inventories2.isEmpty());
		System.out.println(inventories1.toString());
		System.out.println(inventories2.toString());
		System.out.println(inventories1.add(inventories2));
		System.out.println(inventories1.subtract(inventories2));
	}
}