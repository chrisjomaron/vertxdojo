vertx.setPeriodic(1000, { timerID: Long =>
  vertx.eventBus.publish("news-feed", "more news!")
})
