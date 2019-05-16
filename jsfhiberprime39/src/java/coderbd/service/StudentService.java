/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbd.service;

import coderbd.entity.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface StudentService {
      void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    List<Student> getAllStudents();
}
