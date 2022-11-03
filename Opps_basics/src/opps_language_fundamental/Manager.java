package opps_language_fundamental;

public class Manager extends Employee1{
	
	private int teamSize;
	private String Mgrtype;
	private double commision;
	
	
	//Default constructor 
	public Manager() {
		System.out.println("Manager Default constructor is called ");
	}
	
	//Parameterized constructor
	public Manager(int id, String empname,double salary,int depno,int teamSize,String mgrtype ,double commision) {
		super(id, empname,salary,depno);
		
		System.out.println("manager para. const.is called...");
	
		this.Mgrtype=mgrtype;
		this.teamSize=teamSize;
		this.commision=commision;
	}
	
	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public String getMgrtype() {
		return Mgrtype;
	}


	public void setMgrtype(String mgrtype) {
		Mgrtype = mgrtype;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	//Method overriding 
	
	@Override
	public void display() {
		 //we us super.methd name to call the super class method 
		super.display();
		System.out.println("Details:"+this.Mgrtype+","+this.teamSize+","+this.commision);
	}
	@Override
	public double calannualSalary() {
		return (super.calannualSalary())+this.commision;
	 }
	
	public void deligate() {
		System.out.println("Manager"+this.getEmpname()+"work to a team of team Size" +this.teamSize);
	}

}
