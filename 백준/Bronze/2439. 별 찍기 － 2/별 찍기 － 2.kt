fun main() {
    val input = readln().toInt()
    val blank = " "
    val char = "*"

    for (i in 1..input) {
        println(blank.repeat(input-i) + char.repeat(i))
    }
}