fun main() {
    val sum = mutableListOf<Int>()
    do {
        val (a, b) = readln().split(" ").map { it.toInt() }

        if (a == 0 && b == 0) break

        sum.add(a + b)
    } while (true)

    println(sum.joinToString("\n"))
}