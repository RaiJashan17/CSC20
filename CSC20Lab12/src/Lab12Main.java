
public class Lab12Main {

	public static void main(String[] args) {
		SmartStringList smart=new SmartStringList(5);
		smart.add("E");
		smart.add("D");
		smart.add("C");
		smart.add("B");
		smart.add("A");
		smart.sort();
		System.out.println(smart.get(0));
		System.out.println(smart.get(1));
		System.out.println(smart.get(2));
		System.out.println(smart.get(3));
		System.out.println(smart.get(4));
		System.out.println(smart.indexOf("C"));
		System.out.println(smart.indexOf("F"));
	}

}
