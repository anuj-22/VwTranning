package collection1;

import java.util.Comparator;

import opps_language_fundamental.Employee1;

public class ComparatorImplEmp implements Comparator<Employee1>{
	//Comparision suing name 
	public int compare(Employee1 e1 ,Employee1 e2) {
		 
		System.out.println("Compare e1 Name: " +e1.getEmpname()+" and e2 Name: "+e2.getEmpname());
		return (int)(e1.getEmpname().compareTo(e2.getEmpname()));
}
	}


