package kodlamaIOHomework3.entities;

public class Courses {
	private String courseName;
	private double unitPrice;	
	private String instructor;
	private String category;

	public Courses(String courseName, double unitPrice, String category, String instructor) {
		this.courseName = courseName;
		this.unitPrice = unitPrice;
		this.category = category;
		this.instructor = instructor;		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}	

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
