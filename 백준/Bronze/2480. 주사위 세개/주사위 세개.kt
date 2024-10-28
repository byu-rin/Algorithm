fun main() {
    var (first, second, third) = readln().split(" ").map { it.toInt() }
    
    val result = when {
        first == second && second == third ->  10000 + first * 1000
        first == second || first == third -> 1000 + first * 100
        second == third -> 1000 + second * 100
        else -> maxOf(first, second, third) * 100
    }
    println(result)
}