// Here, id, email and type are all properties aka instance variables
class Contact(val id: Int, var email: String) {
  val type = "work"

  fun printId() {
    println(id)
  }
}

// Data classes
// Like normal class but come with additional functions eg
/*
- toString() : Prints a readable string of the class instance and its properties
- equals() : Compares instances of a class
- copy() : Creates a class instance by copying another, potentially with different properties
*/
data class User(val name: String, val id: Int)


// Excercise classes
data class Employee(val name: String, var salary: Int)
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
  val names = listOf("Xialong", "Ernesto", "Regina", "Shabeer")
  fun generateEmployee() : Employee {
    return Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
  }
}

fun main() {
  val contact = Contact(1, "mary@mail.com")

  println(contact.email)
  contact.email = "another@gmail.com"
  println(contact.email)

  contact.printId()

  // Data class stuff
  val user = User("Steve", 3)
  val anotherUser = User("Zifeng", 10)
  // println and print will automatically call toString()
  println(user)
  // == operator will call equals()
  println("user == anotherUser: ${user == anotherUser}"

  // Copying
  val firstCopy = user.copy()  // copies both properties
  val secondCopy = user.copy(name = "Catalina")  // name = "Catalina", id = 3
  val secondCopy = user.copy(id = 100)  // name = "Steve", id = 100
}

fun excercises() {
  // 1
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

  // 2
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}

