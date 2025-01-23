import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.map

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val (a, b) = br.readLine().split(' ').map { it.toInt() }
        if (a == 0 && b == 0) break
        println(a + b)
    }
}