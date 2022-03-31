package com.example.OGMA.Repository;

import com.example.OGMA.Types.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{
    
}