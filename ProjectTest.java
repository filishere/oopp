package oopp;

public class ProjectTest {
	public static void main(String[] args) {

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		employee1.setName("John");
		employee2.setName("Pete");
		employee3.setName("Tom");
		employee4.setName("David");
		
		
		Employee[] array1 = { employee1, employee2 };
		Employee[] array2 = { employee3, employee4 };
		Section Business = new Section("Business", array1);
		Section Travel = new Section("Travel", array2);
		Section[] array = { Business, Travel };
		Company Airline = new Company("Airline", array);
		
	
		Airline.getBoss();
		Airline.setBoss("Joe");
		System.out.println("Name of company: " + Airline.getName() + ", CEO: " + Airline.getBoss());
		System.out.println("Section " + Business.getName());
		System.out.println("The names of the empolyees in Business: " + array1[0].getName() + ", " + array1[1].getName());
		System.out.println("Section " + Travel.getName());
		System.out.println("The names of the empolyees in Travel: " + array2[0].getName() + ", " + array2[1].getName());
	}

}
