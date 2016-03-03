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

  // Using Sieve of Eratosthenes
  // Use only for small set of numbers
  def findPrimesUpTo(number: Int): List[Int] = {
    val primes = scala.collection.mutable.ListBuffer.empty[Int]
    if (number > 2) {
      var numbers = (2 to number).toIndexedSeq
      while (numbers.length > 0) {
        val i = numbers(0)
        primes += i
        numbers = numbers.filter(_ % i != 0)
      }
    }

    primes.toList
  }
}
