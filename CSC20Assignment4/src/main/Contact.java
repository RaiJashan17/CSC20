/* This is the program that creates the object Contact and has methods to access the variables of contact.
 * @author Jashan Rai
 * @version 1.0
 */
package main;

public class Contact {
	private String firstName;
	private String lastName;
	private long homeNumber;
	private long officeNumber;
	private String emailAddress;
/* This is where the programmer can use the parameters to create a new contact object.
 * @param firstName
 * @param lastName
 * @param homeNumber
 * @param officeNumber
 * @param emailAddress
 */
	public Contact(String firstName, String lastName, long homeNumber, long officeNumber, String emailAddress){
		this.firstName=firstName;
		this.lastName=lastName;
		this.homeNumber=homeNumber;
		this.officeNumber=officeNumber;
		this.emailAddress=emailAddress;
	}
/* This allows the programmer to change the firstName variable.
 * @param firstName 
 */
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
/* This allows the programmer to change the lastName variable.
 * @param lastName
 */
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
/* This allows the programmer to change the homeNumber variable.
 * @param homeNumber
 */
	public void setHomeNumber(long homeNumber){
		this.homeNumber=homeNumber;
	}
/* This allows the programmer to change the officeNumber variable.
 * @param officeNumber
 */
	public void setOfficeNumber(long officeNumber){
		this.officeNumber=officeNumber;
	}
/* This allows the programmer to change the emailAddress variable.
 * @param emailAddress
 */
	public void setEmailAddress(String emailAddress){
		this.emailAddress=emailAddress;
	}
/* This returns the firstName of the contact to the programmer.
 * @return this.firstName
 */
	public String getFirstName(){
		return this.firstName;
	}
/* This returns the lastName of the contact to the programmer.
 * @return this.lastName
 */
	public String getLastName(){
		return this.lastName;
	}
/* This returns the homeNumber of the contact to the programmer.
 * @return this.homeNumber
 */
	public long getHomeNumber(){
		return this.homeNumber;
		
	}
/* This returns the officeNumber of the contact to the programmer.
 * @return this.officeNumber
 */
	public long getOfficeNumber(){
		return this.officeNumber;
	}
/* This returns the emailAddress of the contact to the programmer.
 * @return this.emailAddress
 */
	public String getEmailAddress(){
		return this.emailAddress;
	}
/*This returns the string of all the values, with some formatting done to make it print in rows.
 @return this.firstName + this.lastName + this.homeNumber + this.officeNumber + this.emailAddress
 */
	public String toString(){
		if(this.homeNumber==0 || this.officeNumber==0){
			if(this.homeNumber==0 && this.officeNumber!=0){
				return String.format("%-15s%-15s%-15s%-15s%-15s\n", this.firstName,this.lastName,"-",this.officeNumber,this.emailAddress);
			}else if(this.homeNumber!=0 && this.officeNumber==0){
				return String.format("%-15s%-15s%-15s%-15s%-15s\n", this.firstName,this.lastName,this.homeNumber,"-",this.emailAddress);
			}else{
				return String.format("%-15s%-15s%-15s%-15s%-15s\n", this.firstName,this.lastName,"-","-",this.emailAddress);
			}
		}
		return String.format("%-15s%-15s%-15s%-15s%-15s\n", this.firstName,this.lastName,this.homeNumber,this.officeNumber,this.emailAddress);
	}
}
