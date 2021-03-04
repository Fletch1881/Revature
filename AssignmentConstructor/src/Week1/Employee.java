package Week1;

public class Employee {
	//Create Employee class with id,name,age,email
	private int eid;
	private String ename;
	private int age;
	private String email;
	private Address empAddress;
	private Address permAddress;
	private Project empProj;
	
	
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Employee(int eid, String ename, int age, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.email = email;
	}
	
	
	public Employee(int eid, String ename, int age, String email, Address empAddress, Address permAddress,
			Project empProj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.email = email;
		this.empAddress = empAddress;
		this.permAddress = permAddress;
		this.empProj = empProj;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", email=" + email + "]";
	}
	
	
	
	
}
