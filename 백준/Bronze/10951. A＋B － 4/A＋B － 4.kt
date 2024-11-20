import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    
    while (true) {
        val input = br.readLine() ?: break
        val (a, b) = input.split(" ").map { it.toInt() }
        sb.append(a + b).append("\n")
    }
    
    print(sb.toString())
}
