/* This is the part of the program that puts contacts into an array list and looks for or sorts the contacts
 * @author Jashan Rai
 * @version 1.0
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	protected ArrayList<Contact> contacts;
/*This method initializes the Array List contacts
 */
	public PhoneBook(){
		contacts=new ArrayList<>();
	}
/* This method takes the file and creates contacts from the data and puts them in the list
 * @param file
 */
	public PhoneBook(File file){
		contacts=new ArrayList<>();
		Scanner fileReader=null;
		
		try{
			fileReader=new Scanner(file);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		while(fileReader.hasNextLine()){
			String line=fileReader.nextLine();
			String[] info=line.split(",");
			try{
				Contact c=new Contact(info[0],info[1],Long.parseLong(info[2]),Long.parseLong(info[3]),info[4]);
				add(c);
			}catch(NumberFormatException e){
				if(info[2].equalsIgnoreCase("-")==true && info[3].equalsIgnoreCase("-")==false){
					Contact c=new Contact(info[0],info[1],0,Long.parseLong(info[3]),info[4]);
					add(c);
				}else if(info[2].equalsIgnoreCase("-")==false && info[3].equalsIgnoreCase("-")==true){
					Contact c=new Contact(info[0],info[1],Long.parseLong(info[2]),0,info[4]);
					add(c);
				}else{
					Contact c=new Contact(info[0],info[1],0,0,info[4]);
					add(c);
				}
			}
	}
	}
/*This method adds new contacts into the array list, used though method and user
 * @param c
 */
	public void add(Contact c){
		contacts.add(c);
	}
/*This method prints out all the contacts using the toString method of contact, and some code is left over from testing.
 *return result
 */
	public String toString(){
		String result="";
		for(int i=0; i<contacts.size();i++){
			//result+=contacts.get(i).getFirstName();
			result+=contacts.get(i).toString();
			//result+="\n";
		}
		return result;
	}
/*This method uses bubble sort to sort the contacts by their first name.
 */
	public void bubbleSort(){
		for(int i=0; i<contacts.size();i++){
			for(int j=i+1;j<contacts.size();j++){
				if(contacts.get(j).getFirstName().compareToIgnoreCase(contacts.get(i).getFirstName())<0){
					Contact temp=contacts.get(j);
					contacts.set(j, contacts.get(i));
					contacts.set(i, temp);
				}
			}
		}
	}
/*This method uses selection sort to sort the contacts by their last name.*/
	public void selectionSort(){
		for(int i=0; i<contacts.size();i++){
			Contact smallest=contacts.get(i);
			int smallestIndex=i;
			for(int j=i; j<contacts.size();j++){
				String value=contacts.get(j).getLastName();
				if(value.compareToIgnoreCase(smallest.getLastName())<0){
				smallest=contacts.get(j);
				smallestIndex=j;
				
				}
			}
			if(smallestIndex!=i){
				Contact temp=contacts.get(smallestIndex);
				contacts.set(smallestIndex, contacts.get(i));
				contacts.set(i, temp);
			}
		}
	}
/*This method uses binary Search to find a last name within in the contacts and returns true or false depending on if it is found.
 * @param lastName
 * @return true/false
 */
	public boolean binarySearch(String lastName){
		if(this.contacts.size()>=0){
			if(this.contacts.size()>14){
				this.selectionSort();
			}
			int foundIndex, min=0, max=contacts.size()-1;
			while(min<=max){
				int middle=(min+max)/2, current=lastName.compareToIgnoreCase(String.valueOf(contacts.get(middle).getLastName()));
				
				if(current==0){
					//System.out.println(contacts.get(middle).toString());
					return true;
				}else if(current<0){
					max=middle-1;
				}else{
					min=middle+1;
				}
			}
		}
		return false;
	}
}
