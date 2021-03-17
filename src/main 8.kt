fun main(){
    val a = intArrayOf(1, 2, 3)
    val b = intArrayOf(4, 5, 6)
    val c = IntArray(a.size)
    for (i in a.indices) {
        c[i] = a[i] + b[i]
    }
    for(i in c.indices){
        print("${c[i]}")
    }

    println("-----------------")

    println("Массив: ")
    val mas1 = intArrayOf(5, -3, 15, 61, 29, 10, -2, 7)
    for (i in 0..mas1.size - 1) {
        print(mas1[i].toString() + " ")
    }
    var max1 = mas1[0]
    for (i in 1 until mas1.size) {
        if (mas1[i] > max1) {
            max1 = mas1[i]
        }
    }
    println()
    println("Максимальное значение в массиве: $max1")
}