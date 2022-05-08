package com.studentportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentportal.entity.Student;
import com.studentportal.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student saveOrUpdateStudent(Student student) {
		student = studentRepository.saveAndFlush(student);
		return student;
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}
	

	public Optional<Student> getStudentById(Integer id) {
		return studentRepository.findById(id);
	}

	public void deletedById(Integer id) {
		studentRepository.deleteById(id);
	}

	public void updatePhoneByHql(Integer id, String phoneNo) {
		studentRepository.updatePhoneByHql(id, phoneNo);
	}
	
	public void updatePhoneBySql(Integer id, String phoneNo) {
		studentRepository.updatePhoneBySql(id, phoneNo);
	}


}
