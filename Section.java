package oopp;

public class Section {
	private String name;
	private Employee[] employees;
	
	public Section() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public Section(String name, Employee[] employees) {
		this.name = name;
		this.employees = employees;
	}

	
}
