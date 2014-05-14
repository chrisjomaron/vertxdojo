
def eb = vertx.eventBus

vertx.setPeriodic(1000) {
  eb.publish("news-feed","Groovy!")
}
