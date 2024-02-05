fun main() {
  maps()
}
fun maps() {
  // Mutable map
  val juiceMenu: MutableMap<String, Int> = mutableMapOf(
    "apple" to 100,
    "kiwi" to 200,
    "orange" to 110
  )

  // Immutable map
  val readonlyJuiceMenu: Map<String, Int> = mapOf(
    "apple" to 100,
    "kiwi" to 200,
    "orange" to 110
  )
  val juiceMenuLocked: Map<String, Int> = juiceMenu

  // Count and access
  println("This map has ${readonlyJuiceMenu.count()} key-value pairs")
  println("The price of apple juice is ${juiceMenu["apple"]}")

  // Add and remove
  juiceMenu.put("mango", 150)
  juiceMenu.remove("orange")
  println(juiceMenu)

  // Check key in map
  println(readonlyJuiceMenu.containsKey("kiwi")) // true

  // Get keys or values
  println(juiceMenu.keys)
  println(juiceMenu.values)
  println("kiwi" in readonlyJuiceMenu.keys)
  println(100 in readonlyJuiceMenu.values)

  // Excercise
  val number2Word = mapOf(
    1 to "one",
    2 to "two"
    3 to "three"
  )
  val n = 2
  println("$n is spelt as '${number2Word[n]}'")
}
