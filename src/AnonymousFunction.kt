fun main() {
    // lamda expression
    foo(5) { it * it }

    // anonymous function
    foo(10, fun(x): Int { return if (x != 0) x * x else -1 })
}

fun foo(x: Int, fooFun: (Int) -> Int): Int {
    val result = fooFun(x)
    println(result)
    return result
}