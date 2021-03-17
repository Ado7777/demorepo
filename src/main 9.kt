fun main() {
    for (i in 0..3) {
        for (j in 0..4) {
            print("* ")
        }
        println()
    }

    val n: Int = 5
    for (i in 0..n) {
        for (j in 0 until n - i) {
            print("  ")
        }
        for (j in i downTo 1) {
            print("* ")
        }
        println()
    }


    var number = readLine()!!.toInt()
    var numberOtver = number
    var count: Int
    if (number == 0)
        count=1
    else
        count=0
    while (number !=0) {
        count++
        number /= 10
    }
    println("число $numberOtver содержит $count цифр(у,ы)")

    var a = 1
    var b = 2
    while (a <= 20) {
        print("$b ")
        a++
        b *= 2
    }
    }



