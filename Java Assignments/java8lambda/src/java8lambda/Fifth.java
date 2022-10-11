package java8lambda;
import java.util.*;
public class Fifth {
	
	public static void main(String[] arga) {
		StringBuilder b = new StringBuilder();
		List<String> s = new ArrayList<>(Arrays.asList("Ganesh", "India", "Abc"));
		s.forEach(word->b.append(word.charAt(0)));
		System.out.println(b);
		
		
		}
		
	}


