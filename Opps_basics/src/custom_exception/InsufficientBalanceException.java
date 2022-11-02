package custom_exception;

public class InsufficientBalanceException  extends Exception{
	private double currBal;
	private double withAmt;
	private int accno;
	public InsufficientBalanceException(double currBal, double withAmt, int accno) {
		super();
		this.currBal = currBal;
		this.withAmt =  withAmt;
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "InsufficientBalanceException [currBal=" + currBal + ", withdraw=" +  withAmt + ", accno=" + accno + "]";
	}
	
	
}
