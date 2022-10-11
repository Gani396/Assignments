package Fourteen;

import java.util.ArrayList;
import java.util.List;

import assingmentFifth.Trader;
import assingmentFifth.Transiction;

public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("ganesh","Indore");
		Trader t2 = new Trader("jahu","Pune");
		Trader t3 = new Trader("abc","Lucknow");
		Trader t4 = new Trader("kan","hyd");
		Trader t5 = new Trader("mai","Delhi");

		List<Transiction> transiction = new ArrayList<>();
		transiction.add(new Transiction(t1, 2011, 100000));
		transiction.add(new Transiction(t2, 2015, 1000000));
		transiction.add(new Transiction(t3, 2013, 20000));
		transiction.add(new Transiction(t4, 2017, 150000));
		transiction.add(new Transiction(t5, 2014, 50000));
		

		transiction.stream().sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue())).limit(1)
				.forEach(System.out::println);
	}

}
