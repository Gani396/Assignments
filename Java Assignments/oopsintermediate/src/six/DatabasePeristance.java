package six;

public class DatabasePeristance  extends Peristance{
	
	@Override
	void persist() {
		System.out.println("Storing in Database");
	}

}
