package hellostring1;

public class FindString {
	public static void main(String[] args) {
		String str = "Java String pool refers to collection of strings which are stored in heap memory ";
		System.out.println(str);
		String find = "collection";
		boolean val = str.contains(find);
		if(val)
			System.out.println("String found: " +find);
		else
			System.out.println("String not found");
		
	}

}
