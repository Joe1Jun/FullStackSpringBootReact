# Full Stack Spring Boot React Student Management App

This project is a basic application that allows users to add a student through the front end. The student data is passed to the Spring Boot backend and stored in a MySQL database. The application then displays a list of all the students below the input form.

## Features

- **User Input**: Users can add student details via a form on the front end.
- **Spring Boot Backend**: Handles requests from the React front end and interacts with the MySQL database.
- **MySQL Database**: Stores student information persistently.
- **Material UI**: Utilized for styling and building responsive components.

## Project Structure

- **Frontend**: React application that allows user interaction.
- **Backend**: Spring Boot application that processes data and interacts with the database.

### Java Package Structure

```
src/main/java/com/joejunker
```

## Usage

1. **Clone the Repository:**
   - Open your terminal.
   - Clone the repository using:
     ```bash
     git clone https://github.com/Joe1Jun/FullStackSpringBootReact.git
     ```

2. **Setup the MySQL Database:**
   - Create a new database in MySQL (e.g., `student_db`).
   - Update the database connection settings in `src/main/resources/application.properties` file:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/student_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **Run the Spring Boot Application:**
   - Navigate to the backend directory and run the application using:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Run the React Application:**
   - Navigate to the frontend directory and install the required dependencies:
     ```bash
     npm install
     ```
   - Start the React application:
     ```bash
     npm start
     ```

5. **Access the Application:**
   - Open your browser and go to `http://localhost:3000` to interact with the application.

## Example Usage

- Enter student details in the input form.
- Click the "Add Student" button to submit the data.
- The list of all students will be displayed below the input form.

## Dependencies

- **Frontend**: React, Material UI
- **Backend**: Spring Boot, Spring Data JPA, MySQL Driver

## Contributing

Feel free to fork the repository and submit pull requests for any improvements or features.
