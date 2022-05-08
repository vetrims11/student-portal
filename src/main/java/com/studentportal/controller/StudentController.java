package com.studentportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentportal.entity.Student;
import com.studentportal.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveOrUpdateStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentService.findAll();
	}
	
	@GetMapping("/studentById/{id}")
	public Optional<Student> getStudentById(@PathVariable Integer id){
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studentService.deletedById(id);
	}
	
	@PutMapping("/updatePhoneByHql/{id}/{phoneNo}")
	public void updatePhoneByHql(@PathVariable Integer id, @PathVariable String phoneNo) {
		studentService.updatePhoneByHql(id, phoneNo);
	}
	
	@PutMapping("/updatePhoneBySql/{id}/{phoneNo}")
	public void updatePhoneBySql(@PathVariable Integer id, @PathVariable String phoneNo) {
		studentService.updatePhoneBySql(id, phoneNo);
	}
	

}
