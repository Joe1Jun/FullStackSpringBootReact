// All components used for the form are imported from material.ui

import * as React from 'react';
import { useState } from 'react';
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
    
    //This handles the onClick event when the form is submitted(when the button is clicked)

    const handleClick = (e) => {
        // This prevents the page from defaulting to a blank page after the event 
        e.preventDefault()
        const student = { name, address }
        console.log(student)
        fetch("http://localhost:8080/student/add", {
            method: "POST",
            header: { "Content-Type": "application/json" },
            body:JSON.stringify(student)
            
        }).then(() => {
            console.log("New Student added")
        })

    }
       
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
                    
    
        </Container>
        
                    
    );
    
    

}
