package com.scala

object Main {
  def main(args: Array[String]): Unit = {
    val pt = new Point(5, 10)
    pt.move(10, 10)

    val lc = new Location(5,10,20)
    lc.move(3,2,1)

  }

}