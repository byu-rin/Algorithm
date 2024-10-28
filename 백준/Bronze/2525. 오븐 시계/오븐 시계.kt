fun main() {
    var (hour, minute) = readln().split(" ").map { it.toInt() } // 17 40
    val timer = readln().toInt() //  80
    val running = minute + timer // 120

    if (running >= 60) {
        val quot = timer / 60 // 1
        val reminder = timer % 60 // 20

        hour += quot // 19
        minute += reminder // 60

        if (minute >= 60) {
            minute -= 60
            hour += 1
        }

        if (hour >= 24) {
            hour -= 24
        }

        println("$hour $minute")
    } else {
        println("$hour" + " " + "$running")
    }
}