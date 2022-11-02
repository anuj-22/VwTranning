package collection1;
import java.util.*;
public class ExArrayList {

	public static void main(String[] args) {
		List<Integer>Lst= new ArrayList<Integer>();
		Lst.add(100);  //new Integer(100) //-- autoboxing boxing primitive into object type
		Lst.add(60);
		Lst.add(80);
		Lst.add(100);
		Lst.add(40);
		
		System.out.println(Lst);
		System.out.println(Lst.get(1));//new integer(100).intvalue auto-unboxing
		int no =(int)Lst.get(1);
		System.out.println(no);
		/*Lst.remove(1);
		System.out.println(Lst);*/
		Lst.add(10);
		System.out.println(Lst.size());
		//to check a value is present or not contains is used.
		System.out.println(Lst.contains(10));
		
	/*	List<String>Tst= new ArrayList<String>();
		Tst.add("Ravo");  //new Integer(100) //-- autoboxing boxing primitive into object type
		Tst.add("knocker");
		Tst.add("Wakanda");
		Tst.add("Tony");
		Tst.add("Parker");
		
		System.out.println(Tst);
		System.out.println(Tst.get(1));
		String no1 =Tst.get(2);
		System.out.println(no1);
		
		*/
		

	}

}
