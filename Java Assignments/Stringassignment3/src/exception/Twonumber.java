package exception;
import java.util.*;

public class Twonumber {
	public static void main(String[] args) {
			int a= 10;
			int b = 0;
			try {
				int c = a/b; // Throw exception
				
			}
			catch(ArithmeticException e){
				System.out.println("Ae handled");
			}
			
				
		
		
	}

}
