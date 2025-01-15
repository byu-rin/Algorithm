import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, x) = br.readLine().split(" ").map { it.toInt() }
    val a = br.readLine().split(" ").map { it.toInt() }

    for (num in a) {
        if (num < x) {
            print("$num ")
        }
    }
}