package org.liujun.scala.chapter5

object Practice {

  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increament()
    println(myCounter.current)
  }

}

private class Counter {
  private var value = 0
  def increament() {value += 1}
  def current = value
}
