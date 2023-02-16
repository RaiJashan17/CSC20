/* Description: This is the file that creates the train that is multiple cars,
 * and these methods allow the helper and main to manipulate the train.
 * @author: Jashan Rai
 * @version: 1.0
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class train{ private car front;
/*Description: This sets the front of the train when there are no cars to null
 * 
 */
	public train(){
		this.front=null;
	}
/*Description: Checks the file and adds cars based on the information to the train.
 * @param carFile
 */
	public train(String carFile){
		Scanner fileReader=null;
		try{
			fileReader=new Scanner(new File(carFile));
		}catch(FileNotFoundException e){
			System.out.println("File not found\n");
		}
		String[] info;
		String line;
		
		while(fileReader.hasNextLine()){
			line=fileReader.nextLine();
			info=line.split(",");
			attach(info[0],Integer.valueOf(info[1]),info[2]);
		}
		fileReader.close();
	}
/*Description: This method removes cars with the exact factoryName from the train.
 * 	@param factoryName
 */
	public void detach(String factoryName){
		if (this.front==null){
			return;
		}
		car current=this.front, prev=null;
		
		if (current != null && current.factory.equalsIgnoreCase(factoryName)){
			this.front=current.next;
			System.out.println("The car is detached at " + factoryName +"\n");
			return;
		}
		
		while (current != null && current.factory.equalsIgnoreCase(factoryName)==false){
			prev=current;
			current=current.next;
		}
		if(current==null){
			System.out.println("The car is detached at " + factoryName + "\n");
			return;
		}
		prev.next=current.next;
		detach(factoryName);
	}
/*Description: This method adds car objects to the train at the back and then calls sort to put them in order.
 * @param factoryName, stopNumber, materialName
 */
	public void attach(String factoryName, int stopNumber, String materialName){
		if(this.front==null){
			this.front=new car(factoryName, stopNumber, materialName);
		}else{
			car current=this.front;
			while(current.next!=null){
				current=current.next;
			}
			current.next=new car(factoryName, stopNumber, materialName);
			
		}
		sort();
	}
/* Description: This method searches for cars that have the same factory name and prints the information to the user.
 * @param factoryName
 */
	public void search(String factoryName){
		car current=this.front;
		if(this.front==null){
			System.out.println("\nThe train is empty\n");
		}
		while (current.next!=null){
			if(current.factory.equalsIgnoreCase(factoryName)){
				System.out.println(current.factory);
				System.out.println("The material in the car is " + current.material +"\n");
			}
			current=current.next;
		}
	}
/*Description: This method is suppose to help the search method get materials, however it is not used as of now.
 * @param factoryName
 * @return materials
 */
	public List<String> getCars(String factoryName){
		List<String> materials=new LinkedList<>();
		car current=this.front;
		
		while(current.next!=null){
			if(current.next.factory.equalsIgnoreCase(factoryName)){
				materials.add(current.material);
			}
			current=current.next;
		}
		return materials;
	}
/*Description: This method displays all the cars in the train.
 */
	public void displayTrainCars(){
		sort();
		car current=this.front;
		if (this.front==null){
			System.out.println("\nThe train is empty\n");
			return;
		}
		while(current.next!=null){
			System.out.printf( "%-20s %10s %20s %n", current.factory, current.stop, current.material);
			current=current.next;
		}
	}
/*Description: This method combines two data files into one lookup system, saving user time.
 * @param update
 */
	public void merge(String update){
		Scanner fileReader=null;
		String[] info=null;
		String displayNew=null;
		
		try{
			fileReader=new Scanner(new File(update));
		}catch(FileNotFoundException e){
			System.out.println("File was not found!");
		}
		String[] info1;
		String line;
		
		while (fileReader.hasNextLine()){
			line=fileReader.nextLine();
			info1=line.split(",");
			attach(info1[0],Integer.valueOf(info1[1]),info1[2]);
			System.out.printf( "%-20s %10s %20s %n", info1[0], Integer.valueOf(info1[1]),info1[2]);
		}
		fileReader.close();
		System.out.println();
		sort();
	}
/*Description: This method sorts the cars based on the stop number, and the stop 1 is at the front.
 */
	public void sort(){
		car current=this.front, index=null;
		int temp;
		String tempFactory, tempMaterial;
		
		if(this.front==null){
			return;
		}else{
			while(current!=null){
				index=current.next;
				while(index!=null){
					if(current.stop>index.stop){
						temp=current.stop;
						tempFactory=current.factory;
						tempMaterial=current.material;
						
						current.stop=index.stop;
						current.factory=index.factory;
						current.material=index.material;
						
						index.stop=temp;
						index.factory=tempFactory;
						index.material=tempMaterial;
					}
					index=index.next;
				}
				current=current.next;
			}
		}
	}
}