package java8lambda;
import java.util.ArrayList;
import java.util.List;

public class Fourth {
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add("Ganesh");
		s.add("thilak");
		s.add("Raj");
		s.add("yadav");
		
		s.removeIf(n-> n.length() % 2!= 0);
		System.out.println(s);
		
	}

}
