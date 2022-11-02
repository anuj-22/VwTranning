package custom_exception;

public class ZeroBalanceException  extends Exception{
	private double currBal;
	private double withAmt;
	private int accno;
	public ZeroBalanceException(double currBal, double withAmt, int accno) {
		super();
		this.currBal = currBal;
		this.withAmt = withAmt;
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "ZeroBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", accno=" + accno + "]";
	}
	
}
