fun main() {
    val tc = readln().toInt() // 4
    val result_list =  mutableListOf(0)
    var sum = 0
    result_list.clear()

    while (result_list.size < tc) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        sum = a + b
        result_list.add(sum)
    }
    val result = result_list.joinToString(separator = "\n")

    println(result)
}