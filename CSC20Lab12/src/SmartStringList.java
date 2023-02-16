/*Description: This creates a smart array that has features such as binary search and selection sort
 * @author: Jashan Rai
 * @version: 1.0
 */
public class SmartStringList {
	
	public String[] strings; //Work in progress
	public Boolean sorted;
	int capacity;
/*Description: This sets up an array with a capacity which is given by the user
 * @param: capacity
 */
	public SmartStringList(int capacity){
		this.sorted=true;
		this.capacity=capacity;
		strings=new String[this.capacity];
	}
/*Description: This adds a value to the array if the array has a empty value
 * @param: s
 */
	public void add(String s){
		for(int i=0; i<strings.length; i++){
			if(strings[i]==null){
				strings[i]=s;
				this.sorted=false;
				return;
			}
		}
	}
/*Description: This gets the string at the index and tells the user if i is too large
 * @param: i
 * @return: strings[i]
 */
	public String get(int i){
		if(i<strings.length){
		return strings[i];
	}else{
		return "The value is larger than the array";
	}
	}
/*Description: This either uses a linear or binary search to find the index value
 * @param: val
 * @return: i, mid, -1
 */
	public int indexOf(String val){
		if(sorted==true){
			for(int i=0; i<strings.length;i++){
				if(strings[i].equalsIgnoreCase(val)){
					return i;
				}
			}
		}else{
			int min=0;
			int max=strings.length-1;
			while(max>=min){
				int mid=(min+max)/2;
				if(strings[mid].compareToIgnoreCase(val)==0){
					return mid;
				}else if(strings[mid].compareToIgnoreCase(val)<0){
					min=mid+1;
					}else{
						max=mid-1;
					}
				}
			}
		return -1;
	}
/* Description: This uses a selection sort to sort the array
 */
	public void sort(){
		if(this.sorted==true){
			return;
		}else{
		int n=strings.length;
		for(int i=0; i<n-1; i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(strings[j].compareToIgnoreCase(strings[i])<0){
					min=j;
				}
			}
		String temp=strings[min];
		strings[min]=strings[i];
		strings[i]=temp;
		}
	sorted=true;
		}
	}
}
