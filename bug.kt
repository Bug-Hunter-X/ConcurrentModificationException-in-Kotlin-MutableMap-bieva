fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // ConcurrentModificationException
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.removeIf { it.key > 2 }
    println(map) //Throws ConcurrentModificationException
}