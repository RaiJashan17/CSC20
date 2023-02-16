package main;

public class main{
	public static final int STEPS = 50;
public static void main(String[] args) {
	int i=1;
	RandomWalker walker = new RandomWalker();
	while (i<=STEPS){
		walker.move();
		System.out.println("X location: " + walker.getX());
		System.out.println("Y location: " + walker.getY());
		System.out.println("Steps taken so far: " + walker.getSteps());
		i++;
	}
}	
}