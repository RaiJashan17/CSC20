/*Description: This file creates the train cars using linked lists to store name, stop number, and item.
@author: Jashan Rai
@version: 1.0
*/

package main;

public class car{public String factory; public int stop; public String material; car next;

/*Car object that calls on the regular constructor using default
 * parameters. Default parameters would be "" for Strings, null for another Car
 * object, and 0 for ints.
 */
	public car(){
		this("",0,"",null);
	}
/*Initializes a Car object that calls on the regular constructor using some 
 * given parameters and a null address for next car object. This constructor is
 * great for adding the last Car to the list.
 * @param fact, s, m
 */
	public car(String fact, int s, String m){
		this(fact, s, m, null);
	}
/*Initializes a Car object that creates the Car object with a address of the next
 * Car object in the list. This is the main constructor, all of the other constructors call
 * on this one. Great for adding Car objects in the middle of the list.
 */
	public car(String fact, int s, String m, car next){
		this.factory=fact;
		this.stop=s;
		this.material=m;
		this.next=next;
	}
}