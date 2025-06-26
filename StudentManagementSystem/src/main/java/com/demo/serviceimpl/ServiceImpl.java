package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.service.StudentService;
@Service
public class ServiceImpl implements StudentService{
     @Autowired
	com.demo.repository.Studentrepository Studentrepository;
	@Override
	public List<Student> getAllStudents() {
		List<Student> list=Studentrepository.findAll();
		return list;
	}
	@Override
	public Student saveStudent(Student student) {
		return Studentrepository.save(student);
	}
	@Override
	public Student getById(int id) {
		
		return Studentrepository.findById(id).get();
	}
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Studentrepository.deleteById(id);
	}
	
	
	
	

}
