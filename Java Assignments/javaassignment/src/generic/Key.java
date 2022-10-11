package generic;
import java.util.HashMap;
import java.util.Map;
public class Key {
	public static void main(String[] atrgs) {
		HashMap<Integer, Double> obj = new HashMap<Integer, Double>();
		obj.put(32, 228.2);
		obj.put(32, 228.6);
		obj.put(32, 228.2);
		obj.put(32, 228.3);
		obj.put(32, 228.4);
		obj.put(32, 228.2);
		obj.put(32, 228.8);
		obj.put(32, 228.7);
		obj.put(32, 228.5);
		obj.put(32, 228.4);
		
		System.out.println("Itering Hashmap");
		for(Map.Entry m : obj.entrySet()){
			System.out.println(m.getKey()+ " "+m.getValue());
			
		}
		
	}

}
