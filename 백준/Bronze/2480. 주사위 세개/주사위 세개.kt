fun main() {
    val (first, second, third) = readln().split(" ").map { it.toInt() }

    if (first == second && second == third) {
        println(10000 + first * 1000)
    } else if (first == second || first == third) {
        println(1000 + first * 100)
    } else if (second == third) {
        println(1000 + second * 100)
    } else {
        val max = if (first > second) {
            if (first > third) first else third
        } else {
            if (second > third) second else third
        }
        println(max * 100)
    }
}