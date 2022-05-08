package com.studentportal.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID")
	private int studentId;
	
	@Column(name = "STUDENT_NAME", length=50, nullable=false, unique=false)
	private String studentName;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@OneToMany
	@JoinColumn(name = "STUDENT_ID")
	private Collection<StudentCourse> studentCourse;
	
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
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the studentCourse
	 */
	public Collection<StudentCourse> getStudentCourse() {
		return studentCourse;
	}

	/**
	 * @param studentCourse the studentCourse to set
	 */
	public void setStudentCourse(Collection<StudentCourse> studentCourse) {
		this.studentCourse = studentCourse;
	}

}
