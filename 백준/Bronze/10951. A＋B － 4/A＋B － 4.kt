import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (scanner.hasNext()) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        println(a + b)
    }
}

