package collection1;
import java.util.ArrayList;
import java.util.List;

import custom_exception.Account;
public class ArrayListAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> lst =new ArrayList<Account>();
		Account ob =new Account("Akshit",110034,3000);
		lst.add(ob);
		
		Account b =new Account("Akshay",110092,2000);
		lst.add(b);
		Account c =new Account("Akash",110010,4000);
		lst.add(c);
		Account d =new Account("Akash",110010,4000);
		lst.add(d);
		
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println("Implimentation of ==:" +(c==d));
		System.out.println("Implimentation of equals:"+c.equals(d));
		System.out.println(lst.contains(new Account("Akash",110010,4000)));
	}

}
