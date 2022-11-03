package interEx;

import java.util.Scanner;

public class InterfaceMain {

	public static void main(String[] args) {
		Bounceable b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bounce multiple");
		String bf =sc.next();
		b=new Ball(bf);
		meth(b,5);
		sc.close();
	}
	public static void meth(Bounceable b,int multiple) {
		b.setBounceMultiple(multiple);
		b.bounce();
	}

}
