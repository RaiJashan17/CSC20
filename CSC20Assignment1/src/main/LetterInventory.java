/*@Author Jashan Rai  
* @Version 1.0
* Description: This program manipulates strings using the object LetterInventory
*/
package main;

import java.util.Arrays;

public class LetterInventory{
	public final int letterCap=26;
	public int[] inventory= new int [letterCap];
	public String data;
	
	public LetterInventory(String data){
		this.data=data;
		this.data=removeNonChar(data); 
		this.data=lowercase(data); 
		this.data=sort(data);
		data=lowercase(data);
		data=removeNonChar(data);
		for (int i = 0; i < data.length(); i++){
			inventory[Integer.valueOf((char)(data.charAt(i)))-97]++;
	}
	}
/* @Param String data
 * @Return String data
 * Description: Replaces all nonchar characters with ""
 */ 
	public String removeNonChar(String data){
			data = data.replaceAll("[^A-Za-z]+", "");
		return data;
	}
/* @Param String data
 * @Return String data
 * Description: Turns the string into lowercase chars
 */ 
	public String lowercase(String data){
		data=data.toLowerCase(); 
		return data; 
	}
/* @Param String data
 * @Return String data
 * Description: Sorts the chars in string in alphabetical order
 */ 
	public String sort(String data){
		char[] chars= data.toCharArray();
		Arrays.sort(chars);
		data=String.valueOf(chars);
		return data;
		
	}
/* @Param char letter
 * @Return inventory[num]
 * @Throw IllegalArgumentException e caused by non-chars
 * Description: Gets amount of certain char in the string
 */ 
	public int get(char letter){
		int num=0;
		try{
			letter=Character.toLowerCase(letter);
			num=letter-'a';
		}
			catch (IllegalArgumentException e) {
			    System.out.println("ERROR");
			    System.exit(0);
		}return inventory[num];
	} 
/* @Param None
 * @Return int size
 * Description: Returns size of the string data
 */ 
	public int size(){ 
		int size=0;
		for(int i=0;i<letterCap;i++){
			size=size+inventory[i];
		}
		return size; 
	}
/* @Param None
 * @Return true or false depending on situation
 * Description: Checks if string s empty, and responds accordingly 
 */ 
	public boolean isEmpty(){
		if (size()==0){
		return true;} 
		else{
			return false; 
		}
	}
/* @Param None
 * @Return result+"]"
 * Description: It displays the data to the user
 */ 
	public String toString() {
		//data=removeNonChar(data);
		//data=lowercase(data);
		//data=sort(data);
		String result = "[";
			for (int i = 0; i < letterCap; i++){
					for (int j=0;j <inventory[i]; j++){
						result +=(char)('a'+i);	
					}
				}
		return result + "]";
						
		}
/* @Param LetterInventory other
 * @Return LetterInventory(this+other)
 * Description: Adds two strings together 
 */ 
	public LetterInventory add(LetterInventory other){
		return new LetterInventory(this.data+other.data);
	}
/* @Param LetterInventory other
 * @Return LetterInventory subtract
 * Description: Subtract two strings 
 */ 
	public LetterInventory subtract(LetterInventory other){
		LetterInventory subtract=new LetterInventory(data);
		int[] tempArr = new int[letterCap];
		for (int i=0; i<letterCap;i++){
			tempArr[i] = this.inventory[i] - other.get((char) ('a' + i));
				if (tempArr[i]<0){
					return null;}
			
	}subtract.inventory=tempArr;
	String subString="";
	char a='a';
	int number;
	int amount;
	for(int i=0;i<letterCap;i++){
		if (tempArr[i]>0){
			amount=tempArr[i];
			number=a+i;
			char updated=(char) number;
			while (amount>0){
				subString=subString+""+updated;
				amount--;
			}
		}
	}subtract.data=subString;
	return subtract;
		}
	}