import Result.Success
import Result.Error

/*
    Use sealed class to specify limited set of possibilities of classes
    Alternative is enum
    Problems with enum :
        1) Enum classes only allow one instance of each type
        2) Enum classes can't hold different info on different classes

    Enum classes should be nested or should be in the same file
 */

fun main() {
    val result = findResult()
    when (result) {
        is Success -> println("Success result: " + result.data)
        is Error -> print("Failure result: " + result.message + " error message: " + result.e.message)
    }
}

fun findResult(): Result {
    return Error("Failed to find result", Exception("error-123"));
}


sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String, val e: Exception) : Result()
}