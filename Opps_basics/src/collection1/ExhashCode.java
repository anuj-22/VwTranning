package collection1;
import java.util.*;
import opps_language_fundamental.Employee1;
import custom_exception.Account;
public class ExhashCode {
	public static void main(String[]args) {
		Set<Employee1> ob = new HashSet<Employee1>();
		Employee1 a =new Employee1(1 ,"Akash", 25000,10);
		ob.add(a);
		ob.add(new Employee1(2,"Akshit", 30000,10));
		ob.add(new Employee1(4,"Akshit", 30000,10));
		ob.add(new Employee1(3,"Akshit", 40000,10));
		ob.add(new Employee1(2,"Akshit", 30000,10));
		//System.out.println(ob);
		
// Set of Account type is created;
//to work we have to override the hashcode and set the condition for code generation
		Set<Account> ac = new HashSet<Account>();
		Account v =new Account("Akshit",110034,3000);
		ac.add(v);
		ac.add(new Account("Akshay",110092,2000));
		ac.add(new Account("Akash",110010,4000));
		ac.add(new Account("Akash",110010,4000));
		//System.out.println(ac);
		System.out.println(ac.size());
		Iterator<Account> itr =ac.iterator();
		 while(itr.hasNext()) {
			 Account i =itr.next();
			 System.out.println(i);
			 }
		System.out.println(ob.size());
		
	}
}
