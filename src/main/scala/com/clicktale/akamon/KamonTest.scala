package com.clicktale.akamon

import com.typesafe.config.ConfigFactory
import kamon.Kamon
import kamon.metric.instrument.Time


object KamonTest {

  def main(args: Array[String]): Unit = {
    val conf = ConfigFactory.load()
    Kamon.start(conf)

    val coolHistogram = Kamon.metrics.histogram("coolHistogram", Map("Cool function" -> "latency"), Time.Milliseconds)

    val metrics = new Metricals()

    println("Trulala")

    while (true) {
      coolHistogram.record(metrics.traceFunctionTime("Trulala"))
      Thread.sleep(5)
    }

    Kamon.shutdown()
  }
}
