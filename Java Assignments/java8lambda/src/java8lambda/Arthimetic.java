package java8lambda;

public class Arthimetic {
	
	interface i{
		int addNumber(int a, int b);
	}
	 public static void main(String[] args) {
		 i add = (int a, int b)-> a+b;
		 System.out.println(add.addNumber(4, 7));
		 i multiply = (int a, int b)->a*b;
		 System.out.println(multiply.addNumber(4, 8));
		 i divide = (int a, int b)-> a/b;
		 System.out.println(divide.addNumber(3, 12));
		 i sub = (int a, int b)->a-b;
		 System.out.println(sub.addNumber(12, 54));
	 }

}

