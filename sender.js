var vertx = require('vertx')

vertx.createHttpServer().requestHandler(function(req) {
    req.response.end("<body><h1>Hello World from javascript!</h1></body>");
}).listen(8080, 'localhost');
