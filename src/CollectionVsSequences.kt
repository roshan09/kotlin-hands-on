/*
    https://kotlinlang.org/docs/reference/sequences.html
*/
fun main() {

    println("result1")
    val seq = sequenceOf(1, 2, 3, 4, 5)
    val seqResult = seq.map { it * it }.map { it + 10 }.filter { it % 2 == 0 }
    seqResult.map { print("$it ") } // doesn't work seqResult is not evaluated until
    seqResult.toList()
        .map { print("$it ") } // convert the sequence to iterable, this causes evaluation of result and print


    println("\nresult2")
    val list = listOf(1, 2, 3, 4, 5)
    val listResult = list.map { it * it }.map { it + 10 }.filter { it % 2 == 0 }
    listResult.map { print("$it ") }

    println("\nresult3")
    val listSeq = list.asSequence()
    val newListSeq = listSeq.map { it + 10 }.take(2)
    newListSeq.map { print(it) } // No result
    newListSeq.toList().map { print("$it ") }
}

