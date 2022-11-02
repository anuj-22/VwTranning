package opps_language_fundamental;

public class Employee1 {
	@Override
	public String toString() {
		return "Details: empid=" + this.empid + ", empname=" + empname + ", salary=" + salary + ", depno=" + depno ;
	}
	private int empid;
	private String  empname ;
	private double salary;
	private int depno;
	
	// public Employee1(){} this is  default constructor 
	public Employee1(){
		System.out.println("Employee Defult constr... is called..");
		this.empid=0;
		this.salary=0;
		this.empname="####";
		this.depno=-1; 
		
	}
	
	
	// this is parameterized constructor to inilize the values ;
	
	public Employee1(int empid, String empname, double salary, int depno) {
//super is constructor call to a super class cons. and should be the first call
		super(); //this is used to call the super class constructor 
		System.out.println("Employeee Parameterized const.. is called.....");
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.depno = depno;
	}
	
//Create a copy constr..
	public Employee1(Employee1 N) {
		super();
		System.out.println("Copy constructor is called..");
		this.empid = N.empid;
		this.empname = N.empname;
		this.salary = N.salary;
		this.depno = N.depno;
	}
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary>0) 
			this.salary = salary;
		else
			System.out.println("Salary cannot is less tham 0");
	}
	public int getDepno() {
		return depno;
	}
	public void setDepno(int depno) {
		this.depno = depno;
	}
	public int getEmpid() {
		return empid;
	}
	 public void display() {
		 System.out.println("Employee Details : "+this.empid+" ,"+this.empname+" ,"+this.salary+" ,"+this.depno);
	 }
	 
	 public double calannualSalary() {
		 return this.salary*12;
	 }
	 //Function overloading is used and is  example of compile time/static overloading 	
	 //Polymorphism is used here 
	 public double calannualSalary(double bonus) {
		 return (this.salary*12)+bonus;
	 }
	 @Override
	 public boolean equals (Object ob) {
		return  this.empid == ((Employee1)ob).empid;
	 }
	 
}
