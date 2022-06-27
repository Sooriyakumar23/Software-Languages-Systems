const express = require('express');

const app = express();

app.get("/", function(req, res){
    const id = req.query.id
    res.send('Welcome Back. The ID is ' + id);
})

app.get("/hello", function(req, res){
    res.send("Hello World Sooriya.....")
})

app.get("/employee/:id", function(req, res){
    const id = req.params.id
    res.send("The employee id is "+ id);     
})

app.listen(8080, function(){
    console.log('Yes, Running.....!');
})