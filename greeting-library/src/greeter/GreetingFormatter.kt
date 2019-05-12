package greeter

object GreetingFormatter {
    fun greeting(name: String): String {
        return "Hello, ${name.toUpperCase()}"
    }
}
