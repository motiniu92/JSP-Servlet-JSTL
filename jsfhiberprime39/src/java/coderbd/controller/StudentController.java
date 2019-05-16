/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbd.controller;

import coderbd.entity.Student;
import coderbd.service.StudentService;
import coderbd.serviceimpl.StudentServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author User
 */
@ManagedBean
public class StudentController {
     private Student student;

    private List<Student> students;
    private StudentService service;

    public void saveStudent() {
        service = new StudentServiceImpl();
        service.saveStudent(student);
        System.out.println("Successfully");
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudentList() {
        students = new ArrayList<>();
        service=new StudentServiceImpl();
        students = service.getAllStudents();
        return students;

    }

    public void setStudentList(List<Student> students) {
        this.students = students;
    }

}
