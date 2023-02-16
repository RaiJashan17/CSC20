// @Author Jashan Rai 
// @Version 1.0
package main;

import java.io.*;   
import java.util.*;
import java.util.Scanner;
import java.util.Random;
class MagicBallHelper{
  // takes in an empty array database
  // opens the file using try catch excption handlin
  // inputs a max of "SIZE" number of answers from the data file
  //keeps count of actual number of entries since file can have less than 20 entries
public static int  readAnswers(String [] answers){
  int count = 0;
  // create a variable called count 
  // inititalize it to 0
  try{
    // create a Scanner and open a file called
    // "answers.txt"
   File file = new File("answers.txt");
   if (file.length()== 0){
	   System.out.println("File is empty or not found, ending program, please check file");
	   System.exit(0);}
   else{
	   ;}
   Scanner scanner = new Scanner(file);
   // while there are lines in the file and 
// count has not exceeded the capacity of the array
   while (scanner.hasNextLine() && count<answers.length){
   // use the length method of arrays
	   int length=answers.length;
   // read the line from the file
	   String line= scanner.nextLine();
   // store it into the answers array
	   answers[count]=line;
   // increment count
	   count++;}
   
  }catch(FileNotFoundException e){
    System.out.println("Error: Data file Not Found");
    System.exit(0);
   
   } finally{
 // return count
  return count;}
   }
// takes in the filled array database and the actual count of
// entries in the array

// repeatedly asks user for questions
public static void playGame(String []answers1, int count1){

  // create a string called input and intitialize it to ""
	String string= "";
  // create a new Scanner to read from console
	System.out.println("Hello, please enter a question that you want to ask to the magic ball.");
	Scanner response = new Scanner(System.in);
	String question = response.nextLine();
	//while the user does not enter "quit"// should be case insensitive
	while (!string.equals("quit")){
	int index=new Random().nextInt(count1);
// randomly indexes into the answers array
// displays the random response to the user
	System.out.println(answers1[index]);
	System.out.println("Please enter a question that you want to ask to the magic ball or type quit to exit.");
	String question2 = response.nextLine();
	string=question2.toLowerCase();}
	//postReply(answers, count); // This can not be called because method is not created yet
	
  //prompt user to enter question
  //call the post reply method to randomly index into
  // the array and display random response to user
  
}

//takes in the filled database and count
// creates a random object and uses the nextInt method with count as parameter to create a random index
// uses this index to index into the array to display the random answer
public static void postReply(String [] answers2, int count2){
  //create random object
  Random rand= new Random();
	// create a variable called randomIndex to get the next integer in the range 0..count-1
  //print the array entry at that index
  for (int randomIndex=0; randomIndex<count2; randomIndex++){
	  System.out.println(answers2[randomIndex]);
  }
}
}
