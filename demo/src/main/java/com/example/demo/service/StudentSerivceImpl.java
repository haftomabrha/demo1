package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentSerivceImpl implements StudentService{
    @Autowired
private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public String deleteStudent(int studentId) {
        boolean exist=studentRepository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException(studentId+" does not found");
        }
        studentRepository.deleteById(studentId);
        return  "student with "+studentId+" is deleted";
    }
    @Transactional
    public String updateStudent(
            int studentId,
            String name,
            String address) {
        Student student=studentRepository.findById(studentId)
                .orElseThrow(()->new IllegalStateException(
                        studentId+" id for student does not eixst"
                ));
        if(name!=null&& !name.isEmpty() &&!Objects.equals(student.getName(),name)){
            student.setName(name);
        }
        if(address!=null&&!address.isEmpty()&&!Objects.equals(student.getAddress(),address)){
            student.setAddress(address);
        }
return "Student with "+student+" is updated";
}
}
