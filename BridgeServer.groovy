def server = vertx.createHttpServer()

// Serve the static resources
server.requestHandler { req ->
  if (req.uri == '/') req.response.sendFile('index.html')
  if (req.uri == '/vertxbus.js') req.response.sendFile('vertxbus.js')
}

vertx.createSockJSServer(server).bridge(prefix: '/eventbus', [[:]], [[:]])

server.listen(8080)
