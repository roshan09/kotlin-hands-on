fun main() {
    val eagle = Eagle("snake")
    eagle.flyAndFindFood()

    val cuckko = Cuckoo(eagle)
    cuckko.flyAndFindFood()
}

interface BirdInterface {
    fun flyAndFindFood()
}

class Eagle(val name : String) : BirdInterface {
    override fun flyAndFindFood() {
        println("Hello i am $name eagle. I am flying and finding food")
    }
}

class Cuckoo(bird : BirdInterface) : BirdInterface by bird {
//    override fun flyAndFindFood() {
//        println("Hello i am cuckoo. I am flying and finding food")
//    }
}

/*
    output when cuckoo has flyAndFindFood.
        Hello i am snake eagle. I am flying and finding food
        Hello i am cuckoo. I am flying and finding food
    output when cuckoo doesn't have flyAndFindFood.
        Hello i am snake eagle. I am flying and finding food
        Hello i am snake eagle. I am flying and finding food
 */