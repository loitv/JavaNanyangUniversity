package nanyang.java.OOP.inheritance.Point3D;

public class Point3D extends Point {

	private int z;
	
	//Constructors
	public Point3D() { //Default no-arg constructor
		super(); // Call superclass' no-arg constructor
		z = 0;
	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	//Public getter setter for private variable
	public int getZ() {
		return this.z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	// toString() to describe itself
	@Override
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")";
	}
}
