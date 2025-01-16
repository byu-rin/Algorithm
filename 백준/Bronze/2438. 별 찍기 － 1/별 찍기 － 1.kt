fun main() {
	val input = readln().toInt()
	var char = '*'

    for( i in 1 ..input) {
        println(char.toString().repeat(i))
    }
}