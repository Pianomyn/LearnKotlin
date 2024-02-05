fun main() {
  
}

fun controlFlow() {
  // Conditional Statements
  val d: Int = 2
  if(d == 1) {
    println("d is 1")
  } else if(d == 2){
    println("d is 2")
  } else {
    println("d is 3")
  }

  // "when" keyword used as statement (piece of code used in control flow)
  // Similar to case in python
  val obj = "Hello"
  when(obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Unknown") // Default case
  }

  // "when" keyword used in an expression (A line of code that produces a value)
  val result = when (obj) {
    "1" -> "One"
    "Hello" -> "Greeting"
    else -> "Unknown" // Default case
  }

  // There is no ternary operator _ ? _ : _
  // Can use if else instead
  println(if (d==2) "two" else "not two")
}
