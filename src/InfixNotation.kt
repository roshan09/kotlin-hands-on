fun main(args: Array<String>) {
    val output = "Hello"
    output.shouldEquals("Hello")
    output shouldEquals "Hello"
}

infix fun String.shouldEquals(s: String): Boolean {
    println("Comparing")
    return this == s
}