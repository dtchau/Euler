object P001_MultiplesOf3And5 {

  def main(args: Array[String]): Unit = {
    Console println (0 until 1000).filter(value => value % 3 == 0 || value % 5 == 0).sum
  }
}