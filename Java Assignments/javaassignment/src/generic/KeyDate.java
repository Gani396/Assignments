package generic;

import java.util.*;

public class KeyDate 
{
	public static void main(String[] args) 
	{
		Map<String, Date> map = new HashMap<>();
		map.put("Today is", new java.util.Date());
		System.out.println(map);
	}
}
