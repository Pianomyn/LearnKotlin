fun main() {
  sets()
}

fun sets() {
  // Mutable set
  val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")

  // Immutable set
  val fruitLocked: Set<String> = fruit
  val readonlyFruits = setOf("apple", "banana", "cherry")

  // Count and set membership
  println("This set has ${readonlyFruits.count()} items")
  println("banana" in readonlyFruits) // check for existence in set with "in" keyword

  // Add and remove
  fruit.add("mango")
  fruit.remove("cherry")
  println(fruit)
}
