fun main() {
    val tc = readln().toInt() // 테스트 케이스 수
    val resultBuilder = StringBuilder()

    for (i in 1..tc) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        resultBuilder.append(a + b).append("\n") // 각 결과를 저장하고 줄바꿈 추가
    }

    print(resultBuilder.toString()) // 모든 결과를 한 번에 출력
}