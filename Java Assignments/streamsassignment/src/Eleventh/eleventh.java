package Eleventh;

import java.util.ArrayList;
import java.util.List;

import assingmentFifth.Trader;
import assingmentFifth.Transiction;

public class eleventh {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("ganesh","hyd");
		Trader t2 = new Trader("anu","Pune");
		Trader t3 = new Trader("yadav","mumbai");
		Trader t4 = new Trader("kahd","banglore");
		Trader t5 = new Trader("mai","Delhi");
		
		
		List<Transiction> transiction = new ArrayList<>();
		transiction.add(new Transiction(t1,2011,100000));
		transiction.add(new Transiction(t2,2015,10000));
		transiction.add(new Transiction(t3,2013,20000));
		transiction.add(new Transiction(t4,2017,150000));
		transiction.add(new Transiction(t5,2014,50000));
		
		
		String str = transiction.stream().map((t)->t.getTrader().getName()).sorted().reduce(" ", (a,b)->a+" "+b);
		System.out.println(str);
	
	
	
	}
}
