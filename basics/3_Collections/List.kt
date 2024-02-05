fun main() {
  /*
  Lists
  - Ordered collections of items
  Sets
  - Unique unordered collections of items
  Maps
  - Sets of key-value pairs where keys are unique and map to only one value

  Each collection can be mutable or read only.
  */
  lists()
}

fun lists() {
  // Read only
  val readOnlyShapes = listOf("triangle", "square", "circle")
  println(readOnlyShapes)
  // [triangle, square, circle]

  // Mutable
  val shapes: MutableList<String> = mutableListof("triangle", "square", "circle")
  println(shapes)
  // [triangle, square, circle]
  shapes.add("hexagon")
  shapes.remove("hexagon")
  shapes.removeAt(3)

  // Can obtain read only view to prevent unwanted modifications
  val shapesView: List<String> = shapes
  println("The second shape is ${shapesView[1]}")
  println("The first shape is ${shapesView.first()} and the last shape is ${shapesView.last()}")
  println("There are ${shapesView.count()} elements in the list")
  println("circle" in shapesView)

  // Excercise
  val greenNumbers = listOf(1, 4, 23)
  val redNumbers = listOf(17, 2)
  println("There are ${redNumbers.count() + greenNumbers.count()} total numbers")
}
