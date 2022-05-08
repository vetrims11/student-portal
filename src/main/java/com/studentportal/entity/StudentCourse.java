package com.studentportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_COURSE")
public class StudentCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_COURSE_ID")
	private int studentCourseId;
	
	@Column(name = "STUDENT_ID")
	private int studentId;
	
	@Column(name = "COURSE_NAME", length=50, nullable=false, unique=false)
	private String courseName;

	/**
	 * @return the studentCourseId
	 */
	public int getStudentCourseId() {
		return studentCourseId;
	}

	/**
	 * @param studentCourseId the studentCourseId to set
	 */
	public void setStudentCourseId(int studentCourseId) {
		this.studentCourseId = studentCourseId;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
