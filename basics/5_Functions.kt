fun main() {
  println(sum(3, 4))
  println(sum(y=10, x=2)) // Named arguments
  printWithPrefix("My message")
  lambdaStuff()
  excercises()
}

// Types are required for function parameters
// Return type after :
fun sum(x: Int, y: Int) : Int {
  return x + y
}

// As single expression
fun sumAsExpression(x: Int, y: Int) = x + y

// Default values for function parameters
// This function returns Unit (similar to null, None etc)
fun printWithPrefix(message: String, prefix: String = "Info") {
  println("[$prefix] $message")
}


// Lambda functions. Can be used in a few ways
// 1. assign a lambda to a variable that you can then invoke later
// 2. pass a lambda expression as a parameter to another function
// 3. return a lambda expression from a function
// 4. invoke a lambda expression on its own

fun lambdaStuff() {
  // Base function
  fun uppercaseStr(str: String) : String {
    return string.uppercase()
  }

  // 1.
  val upperCaseString = { str: String -> str.uppercase() }
  println(upperCaseString("tEsT")

  // 2.
  val numbers = listOf(1, -2, 3, -4, 5, -6)
  val positives = numbers.filter { x -> x > 0 } // Can drop parentheses () if lambda func is only parameter
  // If the lambda expression is the last parameter, it can be written outside the parentheses ()
  // This is called a trailing lambda
  val negatives = numbers.filter { x -> x < 0 }
  println(positives)
  println(negatives)

  val numbers = listOf(1, -2, 3, -4, 5, -6)
  val doubled = numbers.map { x -> x * 2 }
  val tripled = numbers.map { x -> x * 3 }
  println(doubled)
  println(tripled)

  // 3.
  fun toSeconds(time: String): (Int) -> Int = when (time) {
      "hour" -> { value -> value * 60 * 60 }
      "minute" -> { value -> value * 60 }
      "second" -> { value -> value }
      else -> { value -> value }
  }

  // 4.
  println({ str: String -> str.uppercase() }("Hello"))
}

fun excercises() {
  // 1.
  val actions = listOf("title", "year", "author")
  val prefix = "https://example.com/book-info"
  val id = 5
  val urls = actions.map({ x -> "$prefix/$id/$x" })
  println(urls)

  // 2.
  fun repeatN(n: Int, action: () -> Unit) {
    // Write your code here
    var count = n
    while(count > 0) {
      action()
      count--;
    }
  }
  repeatN(5) {println("Hello")}
}
