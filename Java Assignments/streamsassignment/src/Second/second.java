package Second;

import java.util.stream.Collectors;

import assingmentFifth.Fruit;

import java.util.*;

public class second {
	
	public static void main(String[] args) {

	
	List <Fruit> fruits = new ArrayList<>();
	fruits.add(new Fruit("APPLE",98,200,"red"));
	fruits.add(new Fruit("Orange",102,120,"orange"));
	Map<Object, List<Fruit>>f=fruits.stream().collect(Collectors.groupingBy(fruit->fruit.getColor()));
	for(Object fi:f.keySet())
		System.out.println(f.get(fi));
		
	}
}
