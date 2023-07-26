package com.attempt2.springmongo.controller;

import com.attempt2.springmongo.models.Student;
import com.attempt2.springmongo.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController  {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }
    @GetMapping("/")
  public ResponseEntity<?> getStudent()
    {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
    @GetMapping("/{ID}")
    public Student getBookById(@PathVariable String ID) {
        return studentRepository.findById(ID).orElse(null);
    }

    @PutMapping("/")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student)
    {
            return ResponseEntity.ok(studentRepository.save(student));
    }
    @DeleteMapping("/{ID}")
    public void deleteStudent(@PathVariable String ID) {
        studentRepository.deleteById(ID);
    }
}
