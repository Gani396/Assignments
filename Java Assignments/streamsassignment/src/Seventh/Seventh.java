package Seventh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import assingmentFifth.News;

public class Seventh {

	public static void main(String[] args) {
		News news1 = new News(123,"Ganesh","Raj","Incomplete News : Budget Report is Not Complete");
		News news2 = new News(321,"hari","Ram","Budget Report is described in a good manner");
		News news3 = new News(215,"manikanth","Raj","No news about LaLiga fotball under Sports Section");
		News news4 = new News(128,"jai","Vinod","Awesome Description about Budget");
		
		List <News> news = new ArrayList<News>();
		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		
		Map<Object, Long> map=news.stream().collect(Collectors.groupingBy(s->s.getCommentByUser(),Collectors.counting()));
		for(Object keyString : map.keySet() )
						System.out.println("No. of Comments By " +keyString+ " is " +map.get(keyString));

	}

}
