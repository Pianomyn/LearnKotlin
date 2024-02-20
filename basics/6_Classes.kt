import kotlin.random.Random

// Instance variables are called properties
// values in the class header are automatically
// constructed as properties
class Contact(val id: Int, var email: String) {
  val category: String = ""
  fun printId() {
    println(id)
  }
}

// Data classes have same functionality as classes but with extra methods
/*
- toString() : Print instance in readable format
- equals() : Compare instances of a class
- copy() : Copy instances
*/
data class User(val name: String, val id: Int)

// Excercise classes
data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee() =
        Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    println(contact.email)
    contact.email = "jane@gmail.com"
    println(contact.email)
    contact.printId()

    val user = User("Zifeng", 2)
    val anotherUser = User("Catalina", 3)

    // Automatically calls toString()
    println(user)

    // == will call equals()
    println("user == anotherUser: ${user == anotherUser}")

    // Can copy all or some of the values
    println(user.copy())  // Zifeng, 2
    println(user.copy(name = "Max"))  // Max, 2
    println(user.copy(id = 100))  // Zifeng, 100

    // Excercise
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}

