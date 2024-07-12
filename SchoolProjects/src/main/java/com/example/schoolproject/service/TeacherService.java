package com.example.schoolproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schoolproject.entity.Teacher;
import com.example.schoolproject.repository.Teacherrepository;

@Service
public class TeacherService {

	@Autowired
    private  Teacherrepository teacherRepository;

    

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }

}
