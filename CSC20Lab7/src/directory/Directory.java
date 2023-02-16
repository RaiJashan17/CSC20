/*@Author Jashan Rai 
 *@Version 1.0
 *Description: This is the file that has the methods for the directory
 */
package directory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Directory{
	private HashMap<String, String> Directory=new HashMap<String, String>();
/* Description: Sets up the Directory object by reading the file
 * @param: String names
 * @return: None
 */
	public Directory(String names) throws FileNotFoundException{
		Scanner reader=new Scanner(new File(names));
		while(reader.hasNextLine()){
			StringTokenizer st=new StringTokenizer(reader.nextLine(), ":");
			Directory.put(st.nextToken().trim(),st.nextToken().trim());
		}
		reader.close();
	}
	/* Description: Display all names and phone numbers
	 * @param: None
	 * @return: None
	 */
	public void displayDirectory(){
		for(Map.Entry pairEntry : Directory.entrySet()){
			System.out.printf("%-20s %16s \n", pairEntry.getKey(), pairEntry.getValue());
		}
		}
	/* Description: Add a name and phone number to directory
	 * @param: String names, String number
	 * @return: None
	 */	
	public void add(String name, String number){
		System.out.println("Adding   " + name + " " + number);
		Directory.put(name, number);
	}
	/* Description: Deletes a name and phone number from directory
	 * @param: String name
	 * @return: None
	 */
	public void delete(String name){
		System.out.println("Deleting " + name);
		Directory.remove(name);
	}
	/* Description: Changes number of a directory name
	 * @param: String name, String number
	 * @return: None
	 */
	public void change(String name, String number){
		System.out.println("Changing " + name);
		Directory.replace(name, number);
	}
	/* Description: Prints a name from the directory
	 * @param: String name
	 * @return: None
	 */
	public String getPhoneNumber(String name){
		if(Directory.containsKey(name)){
			return " "+Directory.get(name);
		}else{
		return "";	
		}
	}
	}