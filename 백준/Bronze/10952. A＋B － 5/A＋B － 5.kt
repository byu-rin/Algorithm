fun main() {
    val sum = mutableListOf<Int>()
    while (true) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        if (a == 0 && b == 0) {
            break
        }

        sum.add(a + b)
    }

    println(sum.joinToString("\n"))
}