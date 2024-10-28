fun main() {
    val t = readln().toInt()

    for (result in 1..t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        println(a + b)
    }
}