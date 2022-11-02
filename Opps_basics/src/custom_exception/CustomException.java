package custom_exception;

import java.util.Scanner;

public class CustomException {
public static void main(String[] args) {
	Account ob =new Account("Akshit",112134,3000);
	Scanner sc =new Scanner(System.in);
	boolean temp;
	String check;
	do {	System.out.print("Enter the amout you want to widraw:");
		double amt=sc.nextDouble();
		try {
		amt=ob.withdraw(amt);
		}
		catch(InsufficientBalanceException | ZeroBalanceException e)
		{
			System.out.println(e);
			break;
		}
		System.out.println("Do you wish to continue.. pls enter Yes/No");
		
		check=sc.next();
		if(check.charAt(0)=='Y'|| check.charAt(0)=='y') {
			temp=true;
		}else
			temp=false;
	}while(temp);
		
	sc.close();	
	System.out.println("Program ends");	
}
}
