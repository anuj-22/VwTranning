package collection1;

import java.util.*;

import custom_exception.Account;
import opps_language_fundamental.Employee1;

public class ExTreeSet {

	public static void main(String[] args) {
	/*	SortedSet<String> ob = new TreeSet<String>();
		ob.add("Aakash");
		ob.add("Akshit");
		ob.add("Abhay");
		ob.add("Kshitiz");
		System.out.println(ob);
		ob.add("Himanshu");
		System.out.println(ob);*/
		//-->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		SortedSet<Employee1> EmpTree = new TreeSet<Employee1>();
		Employee1 q= new Employee1(104,"paras lohi" ,145000.0 ,5);
		EmpTree.add(q);
		
		EmpTree.add(new Employee1(101,"mukul kilo" ,12000.0 ,3));
		EmpTree.add(new Employee1(102,"nikhil",12000.0,3));
		EmpTree.add(new Employee1(105,"ravi",132000.0,3));
		EmpTree.add(new Employee1(101,"mukul kilo" ,12000.0 ,3));
		System.out.println(EmpTree);
		//------------------->>>>>>>>>>>>>>
		//Treeset comparator is used 
		/*System.out.println("Comparator is used from here....");
		Comparator<Employee1> c = new ComparatorImpl();
		SortedSet<Employee1> EmpTree1 = new TreeSet<Employee1>(c);
		Employee1 q1= new Employee1(104,"paras lohi" ,145000.0 ,5);
		EmpTree1.add(q1);
		EmpTree1.add(new Employee1(101,"mukul kilo" ,12000.0 ,3));
		EmpTree1.add(new Employee1(102,"nikhil",12000.0,3));
		EmpTree1.add(new Employee1(105,"ravi",132000.0,3));
		EmpTree1.add(new Employee1(101,"mukul kilo" ,12000.0 ,3));
		System.out.println(EmpTree1);*/
		//-------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		System.out.print("Accout Comparator is used on the bassis of name");
		Comparator<Account> c1 = new ComparatorImplAcc();
		SortedSet<Account> AccTree = new TreeSet<Account>();
		AccTree.add(new Account("Akshay",110092,2000));
		AccTree.add(new Account("Aakash",110010,4000));
		AccTree.add(new Account("Akash",110010,4000));
		AccTree.add(new Account("Akshit",110034,3000));
		System.out.println(AccTree);
		//------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Comparator<Employee1> c = new ComparatorImpl();
		meth(c);
		c =new ComparatorImplEmp();
		meth(c);//This cannot be used beacuse of it is of accunt type
		
		
	}
	public static void meth(Comparator<Employee1> c){
		System.out.println("Comparator is used from here....");
		SortedSet<Employee1> EmpTree2 = new TreeSet<Employee1>(c);
		Employee1 q2= new Employee1(104,"paras lohi" ,145000.0 ,5);
		EmpTree2.add(q2);
		EmpTree2.add(new Employee1(101,"mukul kilo" ,12000.0 ,3));
		EmpTree2.add(new Employee1(102,"nikhil",12000.0,3));
		EmpTree2.add(new Employee1(105,"ravi",132000.0,3));
		EmpTree2.add(new Employee1(101,"mukul kilo" ,12000.0 ,3));
		System.out.println(EmpTree2);
	}
	
}
