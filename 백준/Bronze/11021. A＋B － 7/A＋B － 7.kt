fun main() {
    val tc = readln().toInt() // 테스트케이스 개수
    val result_list =  mutableListOf(0)
    var sum = 0
    result_list.clear()

    while (result_list.size < tc) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        sum = a + b
        result_list.add(sum)
    }

    for((index, sum) in result_list.withIndex()) {
        println("Case #${index + 1}: $sum ")
    }
}