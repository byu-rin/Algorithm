fun main() {
    val dice = listOf(1..6)
    var (first, second, third) = readln().split(" ").map { it.toInt() }
    val max = maxOf(first, second, third)

    when {
        first == second && second == third ->  println(10000 + first * 1000)
        first == second || second == third || first == third ->
            if (first == second) {
                println(1000 + first * 100)
            } else if (second == third) {
                println(1000 + second * 100)
            } else if (first == third) {
                println(1000 + third * 100)
            }
        first != second && second != third && first != third ->
            println(max * 100)
    }

    /*
    * 값이 모두 같은가 -> 네 -> 아니오
    * 2개 값이 같고 한 값만 다른 경우 -> 1과 2가 같음 비교, 2와 3이 같음 비교, 3과 4가 같음 비교, 같음 출력
    * 값이 모두 다른 경우 -> 1과 2중 대소 비교, 2와 3중 대소 비교, 1과 3 중 대소 비교 (max Of)
    * */
}