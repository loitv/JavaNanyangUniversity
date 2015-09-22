package nanyang.java.OOP.inheritance.Person;

public class Student extends Person {

	private int numCourses; // number of courses taken so far, max 30
	private String[] course; // course codes
	private int[] grade; // grade for the corresponding course codes
	private static final int MAX_COURSE = 30; // maximum number of courses

	// Constructor
	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		course = new String[MAX_COURSE];
		grade = new int[MAX_COURSE];
	}

	@Override
	public String toString() {
		return "Student: " + super.toString();
	}

	// Add a course and its grade - No validation in this method
	public void addCourseGrade(String course, int grade) {
		this.course[numCourses] = course;
		this.grade[numCourses] = grade;
		++numCourses;
	}

	// Print all course taken and their grade
	public void printGrade() {
		System.out.println(this);
		for (int i = 0; i < numCourses; i++) {
			System.out.println(" " + course[i] + ": " + grade[i]);
		}
//		System.out.println();
	}

	// Compute the average grade
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grade[i];
		}
		return (double) sum / numCourses;
	}
}
