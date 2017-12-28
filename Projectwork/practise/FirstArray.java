package practise;

import java.util.ArrayList;
import java.util.List;

public class FirstArray {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		l1.add(1);
		l1.add(7);
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(00);
		l2.add(20);
		l2.add(10);
		System.out.println(l2);
		l1.addAll(1, l2);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
	//	System.out.println(l1.get(3));
		l1.set(3, 30);
	//	l1.addAll("abc");
		System.out.println(l1);
		
		
		
	}

}
