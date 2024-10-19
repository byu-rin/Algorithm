fun main() {
    var (h, m) = readln().split(" ").map { it.toInt() }

    var alarm = m - 45

    if (alarm < 0) {
        alarm += 60
        if (h == 0) {
            h = 23  // h가 0이면 23으로
        } else {
            h -= 1  // h가 0이 아니면 1을 뺌
        }
    }
    
    println("$h $alarm")
}
