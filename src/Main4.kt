import kotlin.math.*
fun main() {
    var a = 10
    val b = 3

    println("a++ = ${a++}")
    println("++a = ${++a}")

    println("a-- = ${a--}")
    println("--a = ${--a}")

    println("-a = ${-a}")

    println("a+b = ${a + b}")
    println("a-b = ${a - b}")
    println("a*b = ${a * b}")
    println("a/b = ${a / b}")
    println("a%b = ${a % b}")

    println("2+2*5 = ${(2 + 2) * 5}")

    a += 2
    println("a+=2 = $a")
    a -= 2
    println("a-=2 = $a")
    a *= 2
    println("a*=2 = $a")
    a /= 2
    println("a/=2 = $a")
    a %= 2
    println("a%=2 = $a")

    fun sqr(x: Double) = x * x

    var d = 1
    var i = -8.5
    var k = 15

    fun discriminant(d: Double, i: Double, k: Double) = sqr(i) - 4 * d * k

        val x1 = (-i + sqrt(discriminant(d.toDouble(), i, k.toDouble()))) / (2 * d)
        val x2 = (-i - sqrt(discriminant(d.toDouble(), i, k.toDouble()))) / (2 * d)
        println(x1)
        println(x2)

    val l = 16.36
    val v = 18.40

    val z = (v - l)*60
    println(z)
}

