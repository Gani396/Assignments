package stringbuffeer;
import java.lang.*;

public class Reverse {
	public void main(String [] args) {
		StringBuffer str = new StringBuffer("This method returns the reversed object on which it is called");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	}

}
