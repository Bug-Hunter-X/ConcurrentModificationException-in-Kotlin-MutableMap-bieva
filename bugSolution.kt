fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

    // Solution 1: Using an iterator
    val iterator = map.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        if (entry.key > 2) {
            iterator.remove()
        }
    }
    println("Solution 1: $map")

    // Solution 2: Using filterTo
    val filteredMap = map.filterTo(mutableMapOf()) { it.key <= 2 }
    println("Solution 2: $filteredMap")

    // Solution 3: Using filter and reassignment
    map.clear()
    map.putAll(map.filter { it.key <= 2 })
    println("Solution 3: $map")
} 