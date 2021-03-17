import kotlin.math.*
fun main(){
val a = 5
val b = 3
val maxValue = when (a>b)
{
    true -> a
    false -> b
}
    println("maxValue:$maxValue")

when {
    3>2 -> println ("3>2")
    2>3 -> println ("2>3")
    "string".length == 6 -> println("length is 6")
    else -> {
        println("else called")
    }
}

    val num = readLine()!!.toInt()
    var str: String = ""
    when(num) {
        1 -> str = "31"
        2 -> str = "28"
        3 -> str = "31"
        4 -> str = "30"
        5 -> str = "31"
        6 -> str = "30"
        7 -> str = "31"
        8 -> str = "31"
        9 -> str = "30"
        10 -> str = "31"
        11 -> str = "30"
        12 -> str = "31"
        else -> str = "несуществующий месяц"
    }
    println("Месяц $num = дней $str")

    println("Введите параметры левой окружности")
    val x = readLine()!!.toDouble()
    val y = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()
    val h = sqrt(x*x + y*y)
    when{
        h>r -> println("точка находится за пределами круга")
        h<r -> println("точка пренадежит кругу")
    }
}