package com.studentportal.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.studentportal.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Transactional
	@Modifying
	@Query(value = "UPDATE Student SET phoneNumber= :phone WHERE studentId= :studId")
	void updatePhoneByHql(@Param("studId") Integer id, @Param("phone") String phoneNo);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE STUDENT SET PHONE_NUMBER= :phone WHERE STUDENT_ID= :studId", nativeQuery = true)
	void updatePhoneBySql(@Param("studId") Integer id, @Param("phone") String phoneNo);

}
