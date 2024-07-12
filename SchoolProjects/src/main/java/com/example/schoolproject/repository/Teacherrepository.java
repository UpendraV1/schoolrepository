package com.example.schoolproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schoolproject.entity.Teacher;

@Repository
public interface Teacherrepository extends JpaRepository<Teacher, Long> {
}