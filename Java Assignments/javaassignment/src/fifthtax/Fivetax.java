package fifthtax;
import java.util.*;
public class Fivetax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER CTC");
		int ctc = sc.nextInt();
		int tax = 0;
		if(0<ctc && ctc < 180000)
			System.out.println("NILL");
		if(181001<ctc && ctc <300000)
			tax=(ctc*10)/100;
		if (300001<ctc && ctc<500000)
			tax=(ctc*20)/100;
		if (500001<ctc && ctc<1000000)
			tax=(ctc*20)/100;
		if(ctc>1000001)
			System.out.println("no tax slab satisfied");
		if (ctc !=0)
			System.out.println("tax payment"+ tax);
			
			
		
	}

}
