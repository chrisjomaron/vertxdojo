load('vertx.groovy');

vertx.createHttpServer().requestHandler { req ->
    req.response.end("Hello World from groovy!");
  }.listen(8080)
