/*
    1) Components used in destructing assignment
    2) Data class provides component methods
    3) For normal class, use operator keyword with normal function to create Component methods
 */


fun main(args: Array<String>) {
    val person = Person("name1", "name2")
    val (name, sname) = person

    println("$name $sname")

    println("${person.component1()} ${person.component2()}")

    val person2 = Person2("name3", "name4")

    val (name2, sname2) = person2

    println("$name2 $sname2")
}

data class Person(val name: String, val sname: String)


class Person2(val name: String, val sname: String) {
    operator fun component1() = this.name
    operator fun component2() = this.sname
}
