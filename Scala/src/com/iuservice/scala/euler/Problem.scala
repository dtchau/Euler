package com.iuservice.scala.euler

/**
  * Created by dtc on 2016-02-29.
  */
abstract class Problem(problem: String, solution: String) {

  final val PROBLEM_HEADER = "===== Problem ====="
  final val SOLUTION_HEADER = "===== Solution ====="
  final val RESULT_HEADER = "===== Result ====="

  def run(): Unit = {
    println(PROBLEM_HEADER)
    println(problem)
    println(SOLUTION_HEADER)
    println(solution)
    println(RESULT_HEADER)
    println(solveTheProblem())
  }

  protected def solveTheProblem(): String;
}
