package com.iuservice.scala.euler.util

/**
  * Created by dtc on 2016-03-01.
  */
object NumberUtil {

  def isPalindrome(number: Int): Boolean = {
    number == number.toString.reverse.toInt
  }

  def fibonacci(number: Int): Int = {
    if (number == 1) {
      1
    } else if (number == 2) {
      2
    } else {
      fibonacci(number - 1) + fibonacci(number - 2)
    }
  }
}
