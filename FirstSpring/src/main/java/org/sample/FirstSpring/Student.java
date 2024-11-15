package org.sample.FirstSpring;

public class Student {
	private int  StudentId;
	private String StudentName;
	private String StudentAddres;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddres() {
		return StudentAddres;
	}
	public void setStudentAddres(String studentAddres) {
		StudentAddres = studentAddres;
	}
	public Student(int studentId, String studentName, String studentAddres) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddres = studentAddres;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddres=" + StudentAddres
				+ "]";
	}
	
	

}
