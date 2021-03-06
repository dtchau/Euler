package com.iuservice.scala.euler.problem

import com.iuservice.scala.euler.Problem
import com.iuservice.scala.euler.util.NumberUtil

/**
  * Created by dtc on 2016-03-01.
  */
class Problem002_EvenFibonacciNumbers extends Problem {

  override protected def getProblem(): String =
    """ Each new term in the Fibonacci sequence is generated by adding the previous two terms.
      | By starting with 1 and 2, the first 10 terms will be:
      |
      | 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
      |
      | By considering the terms in the Fibonacci sequence whose values do not exceed four million,
      | find the sum of the even-valued terms.
    """.stripMargin

  override protected def solveTheProblem(): Any = {
    var sum = 0
    var term = 0
    var index = 1
    while (term < 4000000) {
      term = NumberUtil.fibonacci(index)
      index += 1
      if (term % 2 == 0 && term < 4000000) sum += term
    }

    sum
  }
}

object Problem002_EvenFibonacciNumbers {

  def main(args: Array[String]) {
    new Problem002_EvenFibonacciNumbers().run()
  }
}