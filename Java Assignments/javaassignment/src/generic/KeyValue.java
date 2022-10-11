package generic;
import java.util.HashMap;
import java.util.Map;
public class KeyValue {
	public static void main(String[] args){
		HashMap<Integer,Double> obj = new HashMap<Integer, Double>();
		obj.put(39,39.0);
		obj.put(12,49.0);
		obj.put(35,89.0);
		obj.put(347,390.0);
		obj.put(165,398.0);
		obj.put(67,879.0);
		obj.put(64,8709.0);
		obj.put(76,87.0);
		obj.put(365,7699.0);
		obj.put(39,39.0);
		
		System.out.println("Iterating hashmap");
		for(Map.Entry m: obj.entrySet()){
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}
}
