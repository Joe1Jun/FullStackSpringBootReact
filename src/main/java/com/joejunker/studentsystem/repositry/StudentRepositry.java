package com.joejunker.studentsystem.repositry;

//This is an important interface provided by Spring Data JPA. By extending this interface, your StudentRepository inherits common methods to interact with the database 
//(like saving, finding, deleting, etc.).
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;  // This annotation indicates that the interface is a Spring-managed component related to persistence.

//This is your Student entity that is mapped to a table in your database. 
//This import allows the repository to work with the Student model.
import com.joejunker.studentsystem.model.Student;

//The interface is abstraction
// It will define the methods to be used by other classes
// In this case it extends the the JpaRepository most of the implementation is provided by Spring Data JPA
// StudentRepositry should have the correct spelling for convention

//By extending the Jpa interface the StudentRepositry interface automatically
// inherits basic CRUD operations without needing to implement manually.
//<Student, Integer> specifies the generic parameters
// Student: The entity the repository will manage
// Integer: The type of primary key (id) of the Student entity

@Repository  // This annotation registers the interface as a Spring Data Repository. Spring will automatically generate an implementation at runtime.

public interface StudentRepositry extends JpaRepository<Student, Integer> {

	// The JpaRepository interface already provides basic CRUD methods, 
    // so no need to define methods unless custom queries are needed.
    // For example, JpaRepository includes methods like:
    // save(), findById(), findAll(), deleteById(), and more, which will work for Student objects.
	
}

