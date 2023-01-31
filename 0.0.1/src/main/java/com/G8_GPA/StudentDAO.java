package com.G8_GPA;

public class StudentDAO {

	private int student_id;
	private String student_name;
	private String sub_id;
	public StudentDAO(int student_id, String student_name, String sub_id) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.sub_id = sub_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}

}
