fun main() {
    val total_price = readln().toInt()
    val product_type = readln().toInt()

    val results = mutableListOf<Int>()

    for (i in 1..product_type) {
        val (product_price, count) = readln().split(" ").map { it.toInt() }
        val check = product_price * count
        results.add(check)
    }

    if (results.sum() == total_price) {
        println("Yes")
    } else {
        println("No")
    }
}