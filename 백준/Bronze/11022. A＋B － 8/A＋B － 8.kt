fun main() {
    val tc = readln().toInt() // 테스트케이스 개수
    val input_a = mutableListOf<Int>()
    val input_b = mutableListOf<Int>()
    val result_list = mutableListOf<Int>()
    var sum = 0

    while (result_list.size < tc) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        sum = a + b
        input_a.add(a)
        input_b.add(b)
        result_list.add(sum)
    }

    for ((index, sum) in result_list.withIndex()) {
        println("Case #${index + 1}: ${input_a[index]} + ${input_b[index]} = $sum")
    }
}