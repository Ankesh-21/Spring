package org.learning.crudSpringbootDemo.service;

import org.learning.crudSpringbootDemo.entity.Student;
import org.learning.crudSpringbootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    /*
     * Constructor Injection
     * */
    private StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo){
        this.studentRepo = studentRepo;
    }
    public Student createStd(Student student){
        /*
        * All business logic
        * */
        System.out.println("Entering Service");
        Student stdResp = studentRepo.save(student);
        System.out.println("Exiting Service");
        return stdResp;
    }
    public Student getStudent(Long id){
        Optional<Student> stdResp = studentRepo.findById(id);
        if (stdResp.isPresent()){
            return stdResp.get();
        }
        return null;
    }

    public List<Student> getAllStudents(){
        List<Student> stds = studentRepo.findAll();
        return stds;
    }
    public Student updateStudent(Long id,Student newStudentInfo){
        Optional<Student> existingStudentInfo = studentRepo.findById(id);
        if (existingStudentInfo.isEmpty()){
            return null;
        }
        existingStudentInfo.get().setName(newStudentInfo.getName());
        existingStudentInfo.get().setEmail(newStudentInfo.getEmail());
//        existingStudentInfo.get().setId(newStudentInfo.getId());
        existingStudentInfo.get().setAge(newStudentInfo.getAge());
        existingStudentInfo.get().setRollNo(newStudentInfo.getRollNo());
        existingStudentInfo.get().setSubject(newStudentInfo.getSubject());

        Student updatedStudentInfo = studentRepo.save(existingStudentInfo.get());
        return updatedStudentInfo;
    }
    public Boolean deleteStudent(Long id){
        Optional<Student> existingStudent = studentRepo.findById(id);
        if (existingStudent == null) return false;
        studentRepo.delete(existingStudent.get());
        return true;
    }
}
