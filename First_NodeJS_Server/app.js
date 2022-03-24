const http = require('http')
const fs = require('fs')

const port = 3000

const server = http.createServer(function(req, res){
    res.writeHead(200, { 'Content-Type':'text/html' })
    fs.readFile('app.html', function(error, data) {
        if (error){
            res.writeHead(404)
            res.write('Error File Not Found !')
        }
        else{
            res.write(data)
        }
        res.end()
    })
})

server.listen(port, function(error){
    if (error){
        console.log('There is some issue', error)
    }
    else {
        console.log("Server is running successfully at port: " + port)
    }
})