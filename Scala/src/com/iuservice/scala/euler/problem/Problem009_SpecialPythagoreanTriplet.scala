package com.iuservice.scala.euler.problem

import com.iuservice.scala.euler.Problem

/**
  * Created by dtc on 2016-03-07.
  */
class Problem009_SpecialPythagoreanTriplet(val sum: Int) extends Problem {

  override protected def getProblem() =
    """ A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
      |
      | a2 + b2 = c2
      | For example, 32 + 42 = 9 + 16 = 25 = 52.
      |
      | There exists exactly one Pythagorean triplet for which a + b + c = 1000.
      | Find the product abc.
    """.stripMargin

  override protected def getExplanation() = Some(
    """ If a < b < c and a + b + c = S, then a <= S/3 - 1 and a < b < (A - a)/2 - 1
    """.stripMargin)

  override protected def solveTheProblem(): Any = {
    var product: Int = 0
    val maxA: Int = sum / 3 - 1
    (1 to maxA).find(a => {
      val b = ((a + 1) to (sum - a) / 2 - 1).find(b => {
        val c = sum - a - b
        a * a + b * b == c * c
      })
      if (b != None) {
        product = a * b.get * (sum - a - b.get)
        true
      } else {
        false
      }
    })

    product
  }
}

object Problem009_SpecialPythagoreanTriplet {

  def main(args: Array[String]) {
    new Problem009_SpecialPythagoreanTriplet(1000).run()
  }
}