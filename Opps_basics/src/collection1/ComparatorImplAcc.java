package collection1;
import java.util.Comparator;
import custom_exception.Account;
public class ComparatorImplAcc implements Comparator<Account>{
	//Comparision suing name 
	public int compare(Account e1 ,Account e2) {
		 
		System.out.println("Compare e1 Name: " +e1.getAccount_holder_name()+" and e2 Name: "+e2.getAccount_holder_name());
		return (int)(e1.getAccount_holder_name().compareTo(e2.getAccount_holder_name()));
}
	}
