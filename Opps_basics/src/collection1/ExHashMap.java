package collection1;
import java.util.*;
import java.util.Map;
import opps_language_fundamental.Employee1;
public class ExHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee1> m = new HashMap<Integer,Employee1>();
		Employee1 q= new Employee1(104,"paras lohi" ,145000.0 ,5);
		m.put(q.getEmpid(), q);
		Employee1 k= new Employee1(101,"mukul kilo" ,12000.0 ,3);
		m.put(k.getEmpid(), k);
		m.put(100, new Employee1(100,"Abhay",12100.0,3));
	}

}
