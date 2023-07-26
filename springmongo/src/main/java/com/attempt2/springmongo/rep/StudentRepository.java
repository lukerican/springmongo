package com.attempt2.springmongo.rep;

import com.attempt2.springmongo.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
