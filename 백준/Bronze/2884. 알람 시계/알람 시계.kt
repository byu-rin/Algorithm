fun main() {
    var (h, m) = readln().split(" ").map { it.toInt() }
    var alarm = m - 45
    
    if (alarm < 0) {
        alarm += 60
        if (h == 0) {
            h = 23
        } else {
            h -= 1
        }
    }
    println("$h $alarm")
}
