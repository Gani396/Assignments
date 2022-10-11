package stringbuilder;

public class StringBuilderReverse {
	public void main(String [] args) {
		StringBuilder str = new StringBuilder("This method returns the reversed object on which it is called");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	}

}
