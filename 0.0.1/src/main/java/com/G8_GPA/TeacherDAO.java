package com.G8_GPA;

public class TeacherDAO {

	private int teacher_id;
	private String teacher_name;
	private String sub_id;
	
	public TeacherDAO(int teacher_id, String teacher_name, String sub_id) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.sub_id = sub_id;
	}

	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	
}
