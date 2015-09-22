package nanyang.java.OOP.inheritance.Person;

public class Teacher extends Person {

	private int numCourses; // number of course taught currently
	private String[] courses; // course codes
	private static final int MAX_COURSES = 10; // maximum courses

	// Constructor
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}
	
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}
	
	// Return false if duplicate course to be add
	public boolean addCourse(String course) {
		// Check if the course already in the course List
		for (int i = 0; i < numCourses; i++) {
			if(courses[i].equalsIgnoreCase(course)) {
				return false;
			}
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	
	// Return false if the course does not in the course list
	public boolean removeCourse(String course) {
		// Look for the course index
		int courseIndex = numCourses;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equalsIgnoreCase(course)){
				courseIndex = i;
				break;
			}
		}
		if (courseIndex == numCourses) { // cannot find course to remove
			return false;
		} else { // remove the course and re-arrange for course array 
			for (int i = courseIndex; i < numCourses-1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		}
	}
}
