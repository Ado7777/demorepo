import kotlin.math.*
fun main(){
    val a = 7

    val message =
        if (a % 2 == 0){
    println("a is even")}
    else if(a % 2 != 0 || a % 5 == 0){
    println("a is divisible by 5")}
    else if (a % 2 != 0 || a % 5 != 0){
    println("a is even and not divisible by 5")}
    else
            println("false")
 println(message)

    val b = 2
    val num =
        when{
            b % 2 == 0 -> println("a is even")
            a % 2 != 0 || a % 5 == 0 -> println("a is divisible by 5")
            a % 2 != 0 || a % 5 != 0 -> println("a is even and not divisible by 5")
            else -> {
                println("false")
            }
        }

}

