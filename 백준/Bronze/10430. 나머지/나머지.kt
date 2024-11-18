import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    val one = (a + b) % c
    val two = ((a % c) + (b % c)) % c
    val three = (a * b) % c
    val four = ((a % c) * (b % c)) % c

    bw.write("$one\n" + "$two\n" + "$three\n" + "$four\n")

    bw.flush()
    bw.close()
}