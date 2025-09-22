package Constructor_Level_1;
//Develop an Employee class with:
//employeeID (public).
//department (protected).
//salary (private).
//Write methods to:
//Modify salary using a public method.
//Create a subclass Manager to access employeeID and department.
class EmployyeData{
	public long employeeID;
	protected String department;
	private double salary;
	public EmployyeData(long employeeID, String department,double salary) {
		this.employeeID= employeeID;
		this.department = department;
		this.salary = salary;
		
	}
	  public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        if (salary >= 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Salary cannot be negative!");
	        }
	    }

	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
}
class Manager extends EmployyeData{
	private String project;

    public Manager(int employeeID, String department, double salary, String project) {
        super(employeeID, department, salary);
        this.project = project;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Employee ID : " + employeeID);
        System.out.println("Manager Department : " + department);
        System.out.println("Salary : " + getSalary());
        System.out.println("Project: " + project);
    }
}
public class Employee {
	public static void main(String[] args) {
		EmployyeData emp1 = new EmployyeData(101, "HR", 50000);
	        emp1.displayEmployeeDetails();

	        System.out.println();

	        Manager mgr1 = new Manager(201, "IT", 90000, "AI Project");
	        mgr1.displayManagerDetails();

	        System.out.println();

	        mgr1.setSalary(95000);
	        mgr1.displayManagerDetails();
	}

}
