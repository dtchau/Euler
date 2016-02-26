

// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
// is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

val startTime = System.currentTimeMillis()
val range = 100 to 999

println(
  range
    .map((value) => {
      range.map(_ * value)
    })
    .foldLeft(IndexedSeq[Int]())(_ union _)
    .sortWith((a, b) => a > b)
    .find(isPalindrome)
    .getOrElse("No palindrome found!")
)

println(s"\nTook ${java.text.NumberFormat.getIntegerInstance().format(System.currentTimeMillis() - startTime)}ms.")

def isPalindrome(number: Int): Boolean = {
  number == number.toString.reverse.toInt
}