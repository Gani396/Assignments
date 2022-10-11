package java8lambda;

import java.util.*;

public class Sixth {
		public static void main(String[] args) {
			List<String> s = new ArrayList<>();
			s.add("Ganesh");
			s.add("thilak");
			s.add("Raj");
			s.add("yadav");
			
			s.replaceAll(n-> n.toUpperCase());
			System.out.println(s);
			
		}

	}


