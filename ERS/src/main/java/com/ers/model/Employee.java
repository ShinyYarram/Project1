package com.ers.model;

public class Employee {
	
	private String employeeId;
	private String password;
	private String employeeName;
	private String designation;
	private String department;
	private String email;
	private String type;
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + ", employeeName=" + employeeName
				+ ", designation=" + designation + ", department=" + department + ", email=" + email + ", type=" + type
				+ "]";
	}
	public Employee(String employeeId, String password, String employeeName, String designation, String department,
			String email, String type) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
		this.email = email;
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public Employee() {}
	
	

}
