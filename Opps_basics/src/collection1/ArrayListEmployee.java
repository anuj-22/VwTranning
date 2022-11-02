package collection1;
import java.util.*;
import opps_language_fundamental.Employee1;
public class ArrayListEmployee {
	public static void main(String[]args) {
	List<Employee1> lst =new ArrayList<Employee1>();
	
	Employee1 q= new Employee1(104,"paras lohi" ,145000.0 ,5);
	lst.add(q);
	
	Employee1 k= new Employee1(101,"mukul kilo" ,12000.0 ,3);
	lst.add(k);
	System.out.println(lst);
	System.out.println(lst.size());
}
}