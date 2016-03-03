package com.iuservice.scala.euler.problem

import com.iuservice.scala.euler.Problem

/**
  * Created by dtc on 2016-03-03.
  */
class Problem006_SumSquareDifference(val a: Int, val b: Int) extends Problem {

  override protected def getProblem(): String =
    """ The sum of the squares of the first ten natural numbers is,
      | 12 + 22 + ... + 102 = 385
      |
      | The square of the sum of the first ten natural numbers is,
      | (1 + 2 + ... + 10)2 = 552 = 3025
      |
      | Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum
      | is 3025 − 385 = 2640.
      |
      | Find the difference between the sum of the squares of the first one hundred natural numbers and the square of
      | the sum.
    """.stripMargin


  override protected def solveTheProblem(): Any = {
    if (a < 1 || b < 1 || a >= b) {
      return "Can't compute"
    }

    val range = a to b
    Math.pow(range.sum, 2).toInt - range.map(Math.pow(_, 2).toInt).sum
  }
}

object Problem006_SumSquareDifference {

  def main(args: Array[String]) {
    new Problem006_SumSquareDifference(1, 100).run()
  }
}
