package com.iuservice.scala.euler.problem

import com.iuservice.scala.euler.Problem
import com.iuservice.scala.euler.util.NumberUtil

/**
  * Created by dtc on 2016-03-02.
  */
class Problem005_SmallestMultiple(number: Int) extends Problem {

  override protected def getProblem(): String =
    """ 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
      |
      | What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    """.stripMargin

  override protected def solveTheProblem(): Any = {
    val primes = NumberUtil.findPrimesUpTo(number)
    primes
  }
}

object Problem005_SmallestMultiple {

  def main(args: Array[String]) {
    new Problem005_SmallestMultiple(20).run()
  }
}