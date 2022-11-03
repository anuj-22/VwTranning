package collection1;

import java.util.*;

public class ExLinklist {
	public static void main(String[]args) {
		List<Integer> l =new LinkedList<Integer>();
		l.add(1);
		l.add(4);
		l.add(5);
		l.add(7);
		l.add(3);
		 Iterator<Integer> itr =l.iterator();
		 while(itr.hasNext()) {
			 Integer i =itr.next();
			 System.out.println(i);
		 }
		
	}
}
