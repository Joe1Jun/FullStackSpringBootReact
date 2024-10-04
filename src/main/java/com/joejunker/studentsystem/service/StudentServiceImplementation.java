package com.joejunker.studentsystem.service; // Package declaration for organizing service classes.


import org.springframework.beans.factory.annotation.Autowired; // Importing the @Autowired annotation for dependency injection.
import org.springframework.stereotype.Service;

import com.joejunker.studentsystem.model.Student; // Importing the Student model.
import com.joejunker.studentsystem.repositry.StudentRepositry; // Importing the StudentRepository interface.


@Service
public class StudentServiceImplementation implements StudentService { // Class declaration that implements the StudentService interface.
	
	// Using @Autowired to inject the StudentRepository bean, allowing Spring to manage its lifecycle.
	@Autowired
	private StudentRepositry studentRepository; // Instance variable for accessing the student repository.

	
	// Implementing the saveStudent method defined in the StudentService interface.
	@Override // Indicates that this method overrides a method declared in the interface.
	public  Student  saveStudent(Student student) {
		
		// Calling the save method on the studentRepository to save the Student object to the database.
		return studentRepository.save(student); // Returning the saved Student object.
	}
}
