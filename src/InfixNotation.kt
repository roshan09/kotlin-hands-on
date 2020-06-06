
/*
    Use of infix functions improves readability
    Only application for extension and member function with single parameter
 */

fun main(args: Array<String>) {
    val output = "Hello"
    output.shouldEquals("Hello")
    output shouldEquals "Hello"
}

infix fun String.shouldEquals(s: String): Boolean {
    println("Comparing")
    return this == s
}