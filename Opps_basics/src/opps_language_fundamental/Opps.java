package opps_language_fundamental;

public class Opps {
	
	public static void main (String [] args) {
			Employee1 e = null; //e is refernce of type employee or object refence of type employee
			e=new Employee1(1,"java" ,100000.01 ,2);//object is created 
			System.out.println(e.getEmpid());
			System.out.println(e.getDepno());
			System.out.println("Remaining program conti.....");
			
			System.out.println("-.....................-");
			
			//Employee1 e1=new Employee1(2,"Python" ,110000.01 ,1);
			Employee1 e1=new Employee1(2,"Python" ,110000.01 ,1);
			/*System.out.println("Employee id "+e1.getEmpid());
			System.out.println(e1.getDepno());
			System.out.println(e1.getSalary());
			System.out.println("Remaining program conti.....");
			*/
			e1.display();
			
			Employee1 e2=new Employee1(3,"Raj malo" ,110000.0 ,3);
			double annual =e2.calannualSalary();
			e2.display();
			System.out.println("Annual salary of "+annual);
			
			Employee1 e3=new Employee1(4,"raju chu" ,210000.0 ,4);
			System.out.println("Annual salary of "+e3.calannualSalary(5000));
			Employee1 e4 = new Employee1 (e2);
			e4.display();
		}
}
