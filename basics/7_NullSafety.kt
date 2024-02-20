// Can catch null issues at compile time
/*
- Explicitly declare when null values are allowed in your program.
- Check for null values.
- Use safe calls to properties or functions that may contain null values.
- Declare actions to take if null values are detected.
*/

fun describeString(maybeString: String?): String {
  if (maybeString != null && maybeString.length > 0) {
      return "String of length ${maybeString.length}"
  } else {
      return "Empty or null string"
  }
}
fun lengthString(maybeString: String?): Int? = maybeString?.length


fun main() {
  // Explicitly declare when null values are allowed in your program.
  // Nullable types
  var neverNull: String = "This can't be null"
  // Throws a compiler error
  neverNull = null
  var inferredNonNull = "The compiler assumes non-nullable"
  // Throws a compiler error
  inferredNonNull = null

  var nullable: String? = "You can keep a null here"
  // This is OK
  nullable = null

  // Check for null values.
  printlnt(describeString(nullable))

  // Use safe calls to properties or functions that may contain null values.
  // The safe call operator returns null if the object's property is null
  /*
  Safe calls can be chained so that if any property of an object contains a null value,
  then null is returned without an error being thrown. For example:

  person.company?.address?.country
  */
  println(lengthString(nullable))
  println(nullable?.uppercase())

  // Declare actions to take if null values are detected.
  // Elvis Operator is ?:
  // Write on the left-hand side of the Elvis operator what should be checked for a null value.
  // Write on the right-hand side of the Elvis operator what should be returned if a null value is detected.

    println(nullable?.length ?: 0)
}

