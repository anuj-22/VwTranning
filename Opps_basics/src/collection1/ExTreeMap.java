package collection1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import custom_exception.Account;
import opps_language_fundamental.Employee1;

public class ExTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Employee1, Double> EmpTree = new TreeMap<Employee1, Double>();
		Employee1 q= new Employee1(104,"paras lohi" ,145000.0 ,5);
		EmpTree.put(q,q.getSalary());
		
		EmpTree.put(new Employee1(101,"mukul kilo" ,12000.0 ,3),12000.0);
		EmpTree.put(new Employee1(102,"nikhil",12000.0,3),12000.0);
		EmpTree.put(new Employee1(105,"ravi",132000.0,3),132000.0);
		EmpTree.put(new Employee1(101,"mukul kilo" ,12000.0 ,3),12000.0);
		System.out.println(EmpTree);
		
		System.out.println("Accout Comparator is used on the bassis of name");
		Comparator<Account> c1 = new ComparatorImplAcc();
		SortedMap<Account,String> AccTree = new TreeMap<Account,String>(c1);
		AccTree.put(new Account("Akshay",110092,2000),"Akshay");
		AccTree.put(new Account("Aakash",110010,4000),"Aakash");
		AccTree.put(new Account("Akash",110010,4000),"Akash");
		AccTree.put(new Account("Akshit",110034,3000),"Akshit");
		System.out.println(AccTree);
		/*Iterator<Account> itr =AccTree.iterator();
		 while(itr.hasNext()) {
			 Account i =itr.next();
			 System.out.println(i);*/
		//------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	}
}
