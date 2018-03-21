package academy.learnprogramming.covariance


fun main(args: Array<String>) {

    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    //convertToInt(shortList)

}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose: Flower() {

}

class Garden<out T: Flower> {

}