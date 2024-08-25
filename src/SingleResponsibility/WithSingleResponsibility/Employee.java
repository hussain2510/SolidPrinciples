package SingleResponsibility.WithSingleResponsibility;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeaddress;
	private String contactNumber;
	private String employeeType;
	
	public void save()
	{
		new EmployeeRepository().save(this);
	}
	public void calculateTax() {
		new TaxCalculation().calCulateTax(this);
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	
}
//Reason to change:
//1.change in employee attribute

class EmployeeRepository{
	public void save(Employee employee)
	{
		
		//basically connection db related information
		//Serialize object into a string representation
//		String objectStr=MyUtils.serializeIntoAString(this);
//		Connection connection=null;
//		Statement stmt=null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection=DriverManager.getConnection(objectStr)
//		}
		
	}
}
//Reason to change:
//2.change in connection details

class TaxCalculation{
	public void calCulateTax(Employee employee) {
		//calculate tax related stuff
	}
}

//Reason to change:ß
//3.change in tax calculate method
