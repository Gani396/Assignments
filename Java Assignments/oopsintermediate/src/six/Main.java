package six;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter were to store the database 1 or file 2");
		int store = sc.nextInt();
		if (store == 1) {
			Peristance ob = new DatabasePeristance();
			ob.persist();
		}
		if(store == 2) {
			Peristance ob = new FilePeristance();
			ob.persist();
			
		}
	}

}
