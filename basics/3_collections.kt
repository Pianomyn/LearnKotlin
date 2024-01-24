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

  // Mutable list
  val shapes: MutableList<String> = mutableListof("triangle", "square", "circle")
  println(shapes)
  // [triangle, square, circle]

  // Can obtain read only view to prevent unwanted modifications
  val shapesView: List<String> = shapes
}
