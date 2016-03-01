package com.iuservice.scala.euler.problem

import com.iuservice.scala.euler.Problem

/**
  * Created by dtc on 2016-02-29.
  */
class Problem001_MultiplesOf3And5 extends Problem {

  override protected def getProblem(): String =
    """ If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
      | The sum of these multiples is 23.
      |
      | Find the sum of all the multiples of 3 or 5 below 1000.
    """.stripMargin

  override protected def solveTheProblem(): Any = {
    (0 until 1000).filter(value => value % 3 == 0 || value % 5 == 0).sum
  }
}

object Problem001_MultiplesOf3And5 {
  def main(args: Array[String]) {
    new Problem001_MultiplesOf3And5().run()
  }
}