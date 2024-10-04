
package com.joejunker.studentsystem.service; // Package declaration for organising the service classes.

import java.util.List;

// Importing the Student model, which represents the student entity in the database.
import com.joejunker.studentsystem.model.Student;

// The StudentService interface provides a contract for student-related operations.
// Interfaces in Java are used to define methods that must be implemented by any class that implements the interface.
// This approach allows for abstraction and decouples the implementation from the interface.

public interface StudentService {
    
    // Method to save a student to the database.
    // This method takes a Student object as a parameter and returns the saved Student object.
    // The method is public, meaning it can be accessed from other classes and packages.

   public Student saveStudent(Student student);
   public List <Student> getAllStudents();
}


