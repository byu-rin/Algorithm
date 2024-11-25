import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val repeat_count = br.readLine()
    val array = br.readLine().split(" ").toList()
    val target = br.readLine()

    val count = array.count { it == target }

    println(count)
}
