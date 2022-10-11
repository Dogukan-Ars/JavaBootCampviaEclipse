package kodlamaIOHomework3.entities;

public class Instructors {
	private String instructorFirstName;
	private String instructorLastName;

	public Instructors(String instructorFirstName, String instructorLastName) {
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;		
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;		
	}

}
