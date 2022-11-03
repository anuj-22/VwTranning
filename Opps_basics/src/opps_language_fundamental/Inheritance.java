package opps_language_fundamental;

public class Inheritance {

	public static void main(String[] args) {
		Manager m =new Manager(101,"mukul kilo" ,12000.0 ,3,4,"tech",12000.0);
		m.display();
		
/*reference of employee is created and object is of manager type 
		so at run type method of run type object is run after compilation
		*/
		Employee1 ob =new Manager(104,"paras lohi" ,145000.0 ,5,7,"Sales",16000.0);
		ob.display();
		System.out.println("Annual salary"+ob.calannualSalary());
		//we type cast the ob type because at compile type the type of ob is employee and 
		//employee do not have a deligate method so compiler will show error
		((Manager)ob).deligate();
	
	
	
	}

public static void meth(Employee1 ob) {
	
	ob.display();
	if (ob instanceof Manager) {
		((Manager)ob).deligate();
	}else
		System.out.println("Runtime exception is thrown since instance is of Employee type ");
}



}
