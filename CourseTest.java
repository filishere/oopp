package oopp;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1 = new Course("Maths");
		Course course2 = new Course("IT");
		course1.addStudent("Yordan Yovchev");
		course1.addStudent("Martina Kiriolva");
		course1.addStudent("Kaloyan Koko");
		course2.addStudent("Petra Popova");
		course2.addStudent("Ivana Todorova");
		course2.addStudent("Aleksandur Georchev");

		System.out.println("Number of students in course1 " + ": " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students[i] + ", ");
		}

		course1.dropStudent("Kaloyan Koko");
		
		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students[i] + ", ");
		}

		System.out.println();
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

	}

}
