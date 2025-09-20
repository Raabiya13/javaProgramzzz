package collectframeWork;

import java.util.ArrayList;
import java.util.List;

//child prgrm
public class arrayList {
	public static void main(String[] args) {
		List A1 = new ArrayList();
		
		A1.add(10);
		A1.add(21);
		A1.add("Raabiya");
		A1.add("Samir");
		A1.add(true);
		A1.add(2.6);
		
		System.out.println(A1);//[10, 21, Raabiya, Samir, true, 2.6]
		
		//adding number 13 in index of 0
		A1.add(0,13);
		System.out.println(A1);//[13, 10, 21, Raabiya, Samir, true, 2.6]
		System.out.println(A1.indexOf("Raabiya"));//3
		System.out.println(A1.contains("Samir"));//true
		System.out.println(A1.remove(1));//10
		
		
		
		
	}
}


