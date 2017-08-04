package tr.org.linux.kamp.oop5collections;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private Department courseDepartment;
	private String lecturerName;
	
	private ArrayList<Students> registeredStudents = new ArrayList<>();
	
	public Course (String courseName, Department courseDepartment, String lecturerName) {
		this.courseName =courseName;
		this.courseDepartment = courseDepartment;
		this.lecturerName = lecturerName;
	}


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Department getCourseDepartment() {
		return courseDepartment;
	}

	public void setCourseDepartment(Department courseDepartment) {
		this.courseDepartment = courseDepartment;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public ArrayList getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(ArrayList registeredStudents) {
		this.registeredStudents = registeredStudents;
	}
	
	
	
	public void registerToCourse(Students student) {
		
		registeredStudents.add(student);
		
	}


	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseDepartment=" + courseDepartment + ", lecturerName="
				+ lecturerName + ", registeredStudents=" + registeredStudents + "]";
	}

	

}
