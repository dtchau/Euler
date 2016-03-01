package com.iuservice.scala.euler

/**
  * Created by dtc on 2016-02-29.
  */
abstract class Problem {

  final val PROBLEM_HEADER = "===== Problem ====="
  final val EXPLANATION_HEADER = "===== Explanation ====="
  final val RESULT_HEADER = "===== Result ====="
  final val NO_EXPLANATION = "No explanation provided."

  def run(): Unit = {
    println(s"${PROBLEM_HEADER}\n${getProblem()}\n")
    println(s"${EXPLANATION_HEADER}\n ${getExplanation().getOrElse(NO_EXPLANATION)}\n")
    println(s"${RESULT_HEADER}\n ${solveTheProblem()}\n")
  }

  protected def getProblem(): String;

  protected def getExplanation(): Option[String] = None

  protected def solveTheProblem(): Any;
}