package com.joejunker.studentsystem.model;

// jakarta instead of persistence
//This is JPA JAVA persistence API 
/*
 * This marks a class as an entity that will be mapped to a database table. It comes from the jakarta.persistence package, which replaced javax.persistence in newer versions of Java and frameworks like Spring Boot, 
 * starting from Java EE 9.
 */
import jakarta.persistence.Entity;
/*
 * This annotation specifies how the primary key of the entity will be generated. It is often used in conjunction with the @Id 
 * annotation to indicate the primary key's generation strategy.
 */
import jakarta.persistence.GeneratedValue;
/*
 * This is an enum that defines strategies for generating primary key values. Common strategies include:

IDENTITY: Relies on an auto-increment column in the database, meaning the database 
will automatically generate and increment the value of the primary key.
persist means to store them in the database
 */
import jakarta.persistence.GenerationType;
/*
 * This marks a field in the entity as the primary key for that entity in the database. 
 * This is the field that uniquely identifies each record in the table.
 */
import jakarta.persistence.Id;


/*
 * 
 * @Entity: This annotation tells the JPA (Java Persistence API) that this class represents a database entity. The Student class will map to a table in the database, with each instance of Student representing a row in that table. The class name usually corresponds to the table name, or you can customize 
 * the table name using additional annotations like @Table.
 */
//Each instance of an entity class corresponds to a row in the table, 
//and each field in the class represents a column in the table.


/*
 * Annotations in Java start with @ and provide metadata to the compiler or runtime. In the context of JPA, they tell the framework 
 * how the class and its fields should be treated in relation to the database.
 */
@ Entity


public class Student {
	//his marks the field as the primary key of the entity. In the database, 
	//this will be the unique identifier for each row in the table.
	@Id
	//Purpose: This tells JPA how the primary key (the id field) should be generated. The @GeneratedValue annotation is used in conjunction with @Id to indicate that the value of the primary key will be generated automatically.
    //Effect: In your case, the strategy = GenerationType.IDENTITY means the database will generate and increment the primary key automatically (for example, by using an auto-increment feature in SQL).
    //Without this annotation: You would have to manually assign values to the primary key, which is not ideal for most applications.
	/*
	 * Enum Values for GenerationType:
       AUTO: JPA will automatically choose the generation strategy based on the database.
       IDENTITY: The database is responsible for generating the primary key, typically using an auto-increment column.
       SEQUENCE: JPA uses a database sequence to generate unique values.
       TABLE: JPA uses a special table to generate primary key values.
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String address;
	
	
	public Student() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
}
