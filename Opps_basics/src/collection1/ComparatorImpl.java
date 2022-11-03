package collection1;
import java.util.Comparator;

import opps_language_fundamental.Employee1;
public class ComparatorImpl  implements Comparator<Employee1>{ 
 
	public int compare(Employee1 e1 ,Employee1 e2) {
	 
		System.out.println("Compare e1 Salary: " +e1.getSalary()+" and e2 salary: "+e2.getSalary());
		return (int)(e1.getSalary()-e2.getSalary());
 }
}
