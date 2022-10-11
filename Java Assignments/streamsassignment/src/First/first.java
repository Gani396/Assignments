package First;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import assingmentFifth.Fruit;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("Gauva", 98, 200, "red"));
		fruits.add(new Fruit("Orange", 102, 120, "orange"));
		
		List<Fruit> result = fruits.stream().filter(s -> (s.getCalories() < 100))
				.sorted((p1, p2) -> p2.getCalories().compareTo(p1.getCalories())).collect(Collectors.toList());

		System.out.println("Fruits having calories less than 100 and sorted in descending order according of calories :");
		result.forEach(System.out::println);

	}

}
