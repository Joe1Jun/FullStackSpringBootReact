// All components used for the form are imported from material.ui

import * as React from 'react';
import { useState, useEffect } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container } from '@mui/system';
import { Paper } from '@mui/material';
import { Button } from '@mui/material'

//This exports the function to be used in the app.js to display all features within the form
export default function Student() {
    // destructure the style to be used for paperStyle
    const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" }
    //Utilise useState to set the state of the name in the input box
    const [name, setName] = useState('')
    //Utilise useState to set the state of the address in the input box
    const [address, setAddress] = useState('')
    const [students, setStudents] = useState([])
    
    //This handles the onClick event when the form is submitted(when the button is clicked)

    const handleClick = (e) => {
        // This prevents the page from defaulting to a blank page after the event 
        e.preventDefault()
        const student = { name, address }
        console.log(student)
        // Would use axios for larger scale app as it has the built in features
        // to handle header transfer and no need to manually stringify the body,.
        fetch("http://localhost:8080/student/add", {
         method: "POST", // This tells the server you're sending a POST request
         headers: { "Content-Type": "application/json" }, // This tells the server you're sending JSON data
         body: JSON.stringify(student) // The `body` is the data you're sending, converted to a JSON string
        })
        .then(() => {
          console.log("New Student added") // Once the request completes successfully, this runs
         })


    }
    
    useEffect(() => {
        // This fetches the data from the "http://localhost:8080/student/getAll" API endpoint.
        fetch("http://localhost:8080/student/getAll")
            .then(res => res.json()) // The result is converted to JSON format
            //This variable doesnt need to be defined asit is the value beind passed from the previous then .
            .then(result => {
                // The 'result' contains the list of students fetched from the backend
                setStudents(result) // This updates the state variable 'students' with the fetched data
            })
        
            // An empty dependency array means this useEffect runs only once, when the component mounts
    }, [students])
    
       
    //This is what the function will  return to be used in the app.js file
    return (
        // Container , Paper, Box and Button all imported from mui 
        <Container>
            <Paper elevation={3} style={paperStyle}>
                <h1 >Add Student</h1>
            <Box
      component="form"
      sx={{ '& > :not(style)': { m: 1, width: '25ch' } }}
      noValidate
      autoComplete="off"
    >
      
                    <TextField id="outlined-basic" label="Student name" variant="standard"
                        value={name}
                        onChange={(e) => setName(e.target.value)} />
                    <       TextField id="outlined-basic" label="Student Address" variant="standard"
                        value={address}
                        onChange={(e) => setAddress(e.target.value)} />
                    
                    <Button variant="contained" color="secondary" onClick={handleClick}>
                     Submit
                    </Button>
    </Box>
            </Paper>
            
            <h1>Students</h1>
            <Paper elevation={3} style={paperStyle}>
               {/* The map function iterates over the 'students' array, rendering a Paper component for each student */}
               { students.map(student => (
                /* Each student object is used to render its corresponding details */
              <Paper 
                elevation={6} // Material UI Paper component with an elevation (shadow effect)
                style={{ margin: "10px", padding: "15px", textAlign: "left" }} // Inline styles for spacing and text alignment
                //If the key wasnt included the whole student list would be re rendered cause react doesnt know which item needs to be added
                key={student.id} // A unique key prop is required by React to identify each list item uniquely
              >
                 {/* Display student details */}
                   Id: {student.id} <br/> {/* Display student ID */}
                   Name: {student.name} <br/> {/* Display student name */}
                   Address: {student.address} {/* Display student address */}
               </Paper>
               ))}



            </Paper>
                    
    
        </Container>
        
                    
    );
    
    

}
