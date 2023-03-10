/*Description: This is the main file that runs the program, and this mainly checks where to go within the files
 * @author Jashan Rai
 * @version 1.0
 */
package main;


import java.util.*;
import java.io.*;
public class TopTenMain{
  public static void main (String args[])throws FileNotFoundException{   
    TopTenList ttl= new TopTenList("src/Songs.txt");
    char ch = ' '; String name="";
    int position=0;
    while (ch!='Q') 
      {
        ch=ChartHelper.printMenu();
        if (ch=='I'|| ch=='M'|| ch=='D'|| ch=='S')
            position = ChartHelper.getPosition();
       // if (ch=='N')
        //    name = ChartHelper.getSong();
        switch (ch){
          case 'I' : {ttl.insertSong(position,ChartHelper.getSong()); break;}
          case 'M' : {System.out.println(" Moving to?");ttl.moveSong(position,ChartHelper.getPosition());}break;
          case 'D' : ttl.deleteSong(position);
                     break;
          case 'S' : System.out.println(ttl.getSong(position));
                    break;
          case 'N' : System.out.println(" The position is " + ttl.getPosition(ChartHelper.getSong()));
                     break;
          case 'P' : ttl.printChart();
                     break;
          case 'Q' : System.out.println(" Good Bye! ");
        }  
      }
  }
}