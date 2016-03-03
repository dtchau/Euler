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
    if (number < 2) {
      return "Why the hell are we doing this again..."
    }
    val primes = NumberUtil.findPrimesUpTo(number)
    (2 to number).map(getFactors(_, primes).toSeq)
      .foldLeft(Seq[(Int, Int)]())(_ ++ _)
      .groupBy(_._1)
      .mapValues(_.map(_._2).max)
      .map({ case (k, v) => Math.pow(k, v).toInt })
      .foldLeft(1)(_ * _)
  }

  private def getFactors(number: Int, primes: List[Int]): Map[Int, Int] = {
    val factors = collection.mutable.Map() ++ primes.map((_, 0)).toMap
    var v = number
    var factor = primes.find(v % _ == 0)
    while (factor != None) {
      factors(factor.get) += 1
      v /= factor.get
      factor = primes.find(v % _ == 0)
    }
    factors.toMap
  }
}

object Problem005_SmallestMultiple {

  def main(args: Array[String]) {
    new Problem005_SmallestMultiple(20).run()
  }
}