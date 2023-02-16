/*Description: This is the file that sets up the nodes that the program will use.
 * @author Jashan Rai
 * @version 1.0
 */package main;
/*Description: This creates the class LinkNode, which is the object these files will use.
 * @param pos, song
 */
public class LinkNode{
  int position;
  String songName;
  LinkNode next;
  public LinkNode(int pos,String song){
    position =pos;
    songName=song;
    next=null;

  }
  /*Description: This sets the song name to a new one.
   */
  void addSong(String song){
    songName=song;
  }
  /*Description: This sets the position to a new one.
   */
  void addPosition(int pos){
    position =pos;
  }
  /*Description: This gets the position of the song.
   * @return position
   */
  int getPosition(){
    return position;
}
  /*Description: This sets the position to a new one.
   */
void setPosition(int newpos){
   position=newpos;
}
/*Description: This returns the name of the song
 * @return songName
 */
String getSong(){
  return songName;
}
/*Description: This sets the next node's value to a new one.
 */
void setNext(LinkNode e){
  next=e;
}
/*Description: This gets the node value and returns the value
 * @return next
 */
LinkNode getNext(){
  return next;
}
}