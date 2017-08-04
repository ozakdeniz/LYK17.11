package tr.org.linux.kamp.oop5collections;

import java.util.HashMap;

public class Department {

	private String departmentName;
	private String facultyName;

	HashMap<String, Students> studentList = new HashMap<>(); 
	
	
	public Department(String departmentName, String facultyName) {
		this.departmentName = departmentName;
		this.facultyName = facultyName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public HashMap<String, Students> getStudentList() {
		return studentList;
	}

	public void setStudentList(HashMap<String, Students> studentList) {
		this.studentList = studentList;
	}
	
	public void addStudent(Students student) {
		studentList.put(student.getId(), student);
		
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", facultyName=" + facultyName + ", studentList="
				+ studentList + "]";
	}
	
	
}
