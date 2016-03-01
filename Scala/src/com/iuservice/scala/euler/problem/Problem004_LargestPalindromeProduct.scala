package com.iuservice.scala.euler.problem

import com.iuservice.scala.euler.Problem
import com.iuservice.scala.euler.util.NumberUtil

/**
  * Created by dtc on 2016-03-01.
  */
class Problem004_LargestPalindromeProduct extends Problem {

  override protected def getProblem(): String =
    """ A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
      | is 9009 = 91 × 99.
      |
      | Find the largest palindrome made from the product of two 3-digit numbers.
    """.stripMargin

  override protected def solveTheProblem(): Any = {
    val startTime = System.currentTimeMillis()
    val range = 100 to 999

    range
      .map((value) => {
        range.map(_ * value)
      })
      .foldLeft(IndexedSeq[Int]())(_ union _)
      .sortWith((a, b) => a > b)
      .find(NumberUtil.isPalindrome)
      .getOrElse("No palindrome found!")
  }
}

object Problem004_LargestPalindromeProduct {

  def main(args: Array[String]) {
    new Problem004_LargestPalindromeProduct().run()
  }
}
