fun main() {
    val input = readLine()!!.split(" ")
    val A = input[0].toInt()
    val B = input[1].toInt()

    if (A > B) {
        println(">")
    } else if (A < B) {
        println("<")
    } else {
        println("==")
    }
}