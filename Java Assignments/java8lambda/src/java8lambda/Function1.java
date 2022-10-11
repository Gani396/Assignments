package java8lambda;

import java.util.function.Function;

public class Function1 {
	public static void main(String[] args) {
		Function<Integer, Double> s = a -> a/2.0;
		
		System.out.println(s.apply(10));
		
	}

}
