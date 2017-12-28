package practise;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(10);
		list.add(new Integer(5));
		list.add(5);
		list.add("abc");
		System.out.println(list);
		//for(Object obj:list) {
			//String str=(String) obj;
		
		List<String> list1=new ArrayList<String>();
		list1.add("suchi");
		list1.add("abc");
		list1.add(0,"Hello");
		list1.add(0,"suchi");
		list1.add(1,"def");
		
		for(String obj1:list1) {
			System.out.println(obj1);
			}
		System.out.println(list1);
		System.out.println(list1.indexOf("suchi"));
		System.out.println(list1.lastIndexOf("suchi"));
		System.out.println(list1.lastIndexOf("world"));
	}

}
