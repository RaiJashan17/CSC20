package main;
/**
 * Program that reads tokens from file data.txt and prints the integer
 * tokens found in it to the screen in increasing order.
 *
 * @author Jashan Rai 
 */

import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class FilterSort {
    public static int[] doubleArrayAndCopy(int[] arr) {
    //use the length method to get the size of arr 
    	int length = arr.length;
    //create a temp array that is double the size of arr
    	int temp[] = new int[length*2];
    //store the elements of the arr into temp array using for-loop
    	for (int count=0; count<length; count++){
    		temp[count]=arr[count];}
    // return the temp array
    	return temp;
    }

    public static void main(String[] args) {
        int[] data = new int[8];
    try {
    // create a Scanner and open a file called "data.txt"
    	File file=new File("data.txt");
    	Scanner input=new Scanner(file);
    //initialize index = 0
    	int index = 0;
    // while there are lines in the file 
    	while (input.hasNext()){
    		// read the line from the file (get tokens) 
    		//int index1 = 0; Remnants from the original code, left here just in case
       // check if the token is integer or not.
    		if (input.hasNextInt()==true){
    			data[index]=input.nextInt();
    			index++;
    			int size=data.length;
    			if (size==index){
    	    		data=doubleArrayAndCopy(data);
    	    		}
    	    		else{
    			;
    	    		}
    		}
			else{
				String nextLine=input.next();
	    		} 
     /* A note : For checking integers : You can use hasNextInt() method of Scanner. If it will be Integer(true), then you can use that token by using nextInt() method of Scanner to read it, if false, then use next() method of Scanner and throw away this token*/
       // store the integer token into the answers array
       // increment the index
       // use the length method of arrays to check if the index is equal or greater
       // than the length of array, if it is true, call here doubleArrayAndCopy.   
       }
        
    if(index==0){
     System.out.println("There is no data in file"); 
     }
    else{
		// Sort the array
    	Arrays.sort(data);
    // and Print the elements using loop 
    	for (int num: data){
    		System.out.println(num);
    	}
     }}
     catch(FileNotFoundException e){
       System.out.println("Error: Data file not found");
     }

}}