package java8lambda;
import java.util.HashMap;
import java.util.Map;

public class Seventh {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "obn");
		map.put(2, "rwo");
		
		StringBuilder s = new StringBuilder();
		for(Integer key : map.keySet()) {
			s.append(key + "=" +map.get(key)+ " ");
		}
		System.out.println(s);
		
	}
	

}
