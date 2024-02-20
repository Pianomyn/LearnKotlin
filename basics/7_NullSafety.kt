// Kotlin can detect issues with null values at compile time by
/*
- Explicitly declaring when null values are allowed
- Check for null values
- Use safe calls to properties or functions that may contain null values
- Declare actions to take if null values are found
*/

fun main() {
  // Explicitly declare when null values are allowed
  // By default, a type is not allowed to accept null values
  var neverNull: String = "This can't be null"
  // Throws a compiler error
  neverNull = null

  var inferredNonNull = "The compiler assumes non-nullable"
  // Throws a compiler error
  inferredNonNull = null

  // Nullable types are declared by adding ?
  var nullable: String? = "You can keep a null here"
  nullable = null

  // Check for null values
  fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
  }
  println(describeString(nullable))

  // Use safe calls to properties or functions that may contain null values
  // The safe call operator returns null if the object's property is null
  fun lengthString(maybeString: String?): Int? = maybeString?.length
  println(lengthString(nullable))
  prinltn(nullable?.uppercase())
  /*
    Safe calls can be chained so that if any property of an object contains a null value,
    then null is returned without an error being thrown. For example:

    person.company?.address?.country
  */

  // Declare actions to take if null values are found
  // Elvis Operator
  /*
  Write on the left-hand side of the Elvis operator what should be checked for a null value.
  Write on the right-hand side of the Elvis operator what should be returned if a null value is detected.
  */
  println(nullable?.length ?: 0)
  // 0
}

