package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/register")
    public String registerStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId")
                              int studentId){
        studentService.deleteStudent(studentId);

    }
    @PutMapping(path="{studentId}")
    public void updateStudent(
            @PathVariable("studentId")int studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String address
    ){
        studentService.updateStudent(studentId,name,address);
    }



    }


