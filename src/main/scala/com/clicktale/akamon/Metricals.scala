package com.clicktale.akamon

import org.slf4j.{Logger, LoggerFactory}

import scala.util.Random

class Metricals{
  val logger: Logger = LoggerFactory.getLogger(classOf[Metricals])

  def traceFunctionTime(text: String): Long = {
    val start = System.currentTimeMillis()
    (1 to 300000).foreach(num => Random.nextLong())
    val end = System.currentTimeMillis()
    end - start
}

  def caller(text: String): Unit = {
    traceFunctionTime(text)
  }
}
