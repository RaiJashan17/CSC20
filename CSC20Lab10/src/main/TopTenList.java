/*Description: This is the file that has the methods for running the top ten music charts.
 * @author Jashan Rai
 * @version 1.0
 */
package main;
import java.io.*;
import java.util.*;

public class TopTenList{
public final static int MAX=10;
private
LinkNode front=null;
LinkNode current=null;
int count=0;
  public TopTenList(){
   front=null;
  }
/*Description: This method converts the text file data into a linkedlist that the user will manipulate.
 * @param fileName
 */
  public TopTenList(String fileName)throws FileNotFoundException{
    Scanner file = new Scanner (new File(fileName));
    while (file.hasNextLine()){
      count++;
      String name=file.nextLine().trim();
      LinkNode element = new LinkNode(count,name);
      //System.out.println(name);
      if (front ==null )
         {
           front= element;
           current=element;
         }
      else current.setNext(element);
      current=element;
      //System.out.println(current.getSong());
    }

  }
/*Description: This is the method that prints the chart for the user to see
 */
  void printChart(){
    System.out.println("\n***** TOP TEN CHART **********\n");
    current=front;
    for (int i=1;i<=count;i++){    
    	if (current!=null){
    	System.out.printf("%4d%26s\n",current.getPosition(),current.getSong());
      current = current.getNext();}
    }
  }
/*Description: This gets the song at a certain position and returns it to the main 
 * @param position
 * @return name
 */
 String getSong(int position){
   String name ="ERROR";
   LinkNode t =front;
    if (position <1 || position > count)
     return name;
    else {
      for (int i=1;i<position;i++)
          t=t.getNext();
      name = t.getSong();
      return name;
    }
 }
/*Description: This method gets the position of a certain song inputed by the user.
 * @param song
 * @return pos
 */
 int getPosition(String song){
   current =front;
   int pos =0;
   while(current!=null){
      if (current.getSong().equalsIgnoreCase(song))
          pos = current.getPosition();
      current=current.getNext();
   }
      
   return pos;
 }
 /* Description: This method adjusts the position of the ranks by a certain value, used in other methods.
  * @param e, position
  */
 void adjustPosition(LinkNode e,int position){
   if (e!=null)
    while (e!=null){
      e.setPosition(e.getPosition()+position);
      e=e.getNext();
    }
 }
/* Description: This method deletes a song from a certain position and adjusts the ranking
 * @param position
 */
 void deleteSong(int position){
   LinkNode current=front, prev=null;
   if(current!=null && current.getPosition()==position){
	   front=current.next;
	   return;
   }
   while (current!=null && current.getPosition()!=position){
	   if(current.getPosition()>position){
		   current.position=current.position-1;
	   }
	   prev=current;
	   current=current.next;
   }
   if(current==null){
	   return;
   }
   prev.next=current.next;
   deleteSong(position);
 }
 /*Description: This method adds a song to a spot chosen by the user, has check at beginning to see if it can be added.
  * @param position, song
  */
 void insertSong(int position,String song){
	 int i=0;
	 current=front;
	 while(current!=null){
		 i++;
		 current=current.next;
	 }
	 if(position>=i){
		 System.out.println(" Can not add more values to end of chart, try again with lower value");
		 return;
	 }
	 LinkNode element = new LinkNode(position,song);
	 LinkNode prev=front;
	 current=front;
	 while(current.next!=null && current.position<position){
		 prev=current;
		 current=current.next;
	 }
	 prev.next=element;
	 element.next=current;
	 while(current!=null){
		 current.position=current.position+1;
		current=current.next; 
		
	 }
	 //change this as needed
 }
 /*Description: This method moves the song from one spot in the rankings to another.
  * @param oldPosition, newPosition
  */
 void moveSong(int oldPosition, int newPosition){
   current=front;
   while(current.next!=null && current.position!=oldPosition){
	   current=current.next;
   }
   deleteSong(oldPosition);
   insertSong(newPosition,current.songName);
  //change this as needed
 }

}