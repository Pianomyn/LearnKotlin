fun main() {
  controlFlow()
  loops()
  excercises()
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
  when (obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Unknown") // Default case
  }

  // "when" keyword used in an expression (A line of code that produces a value)
  val result = when (obj) {
    "1" -> "One"
    "Hello" -> "Greeting"
    else -> "Unknown" // Default case, necessary when used as expression
  }

  val temp = 18
  val description = when {
    temp < 0 -> "very cold"
    temp < 10 -> "a bit cold"
    temp < 25 -> "warm"
    else -> "hot"
  }

  // There is no ternary operator _ ? _ : _
  // Can use if else instead
  println(if (d==2) "two" else "not two")
}

fun loops() {
  // RANGES
  // Can create a range of numbers using ..
  // Inclusive range
  // 1..5
  // Exclusive range
  // 1..<5
  // Reverse range
  // 10 downTo 1
  // Step
  // 1..10 step 2

  for(number in 1..5) {
    println(number)
  }

  val cakes = listOf("carrot", "cheese", "chocolate")
  for (cake in cakes) {
    println("Yummy, it's a $cake cake!")
  }

  // Entry controlled loop
  val cakesEaten = 0
  while(cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++;
  }

  // Exit controlled loop (run at least once)
  val cakesBaked = 0
  do {
    println("Bake a cake")
    cakesBaked++
  } while (cakesBaked < cakesEaten)
}

fun excercises() {
  // 1
  val input = "A"
  when (input) {
    "A" -> println("Yes")
    "B" -> println("No")
    "X" -> println("Menu")
    "Y" -> println("Nothing")
    else -> println("There is no button")
  }

  // 2
  var pizzaSlices = 0
  while(pizzaSlices < 7) {
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza")
  }

  pizzaSlices = 0
  do {
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza")
  } while (pizzaSlices < 8)

  // 3
  for (number in 1..100) {
      println(
          when {
              number % 15 == 0 -> "fizzbuzz"
              number % 3 == 0 -> "fizz"
              number % 5 == 0 -> "buzz"
              else -> number.toString()
          }
      )
  }

  // 4
  val words = listOf("dinosaur", "limousine", "magazine", "language")
  for (w in words) {
      if (w.startsWith("l"))
          println(w)
  }
}
