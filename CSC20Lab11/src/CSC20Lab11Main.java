import java.util.Scanner;

public class CSC20Lab11Main {

	public static void main(String[] args) {
		String input="";
		while(input.equalsIgnoreCase("N")==false){
		System.out.println("Please enter a string you want to compare");
		Scanner scan=new Scanner(System.in);
		String string1=scan.nextLine();
		System.out.println("Please enter a string you want to compare");
		String string2=scan.nextLine();
		if(isSame(string1,string2)){
			System.out.println("Both Strings are the Same");
		}else{
			System.out.println("Both Strings are not the Same");
		}
		System.out.println("Do you want to try other strings (Y for yes, N for no)");
		input=scan.nextLine();
		}}		
	
	public static boolean isSame(String string1, String string2){
		if(string1.length()==0 && string2.length()==0){
			return true;
		}else if(string1.length()==string2.length()){
			char letter1=Character.toUpperCase(string1.charAt(0));
			char letter2=Character.toUpperCase(string2.charAt(0));
			if(letter1==letter2){
				return isSame(string1.substring(1),string2.substring(1));
			}else{
				return false;
			}
		}
		return false;
	}

}
