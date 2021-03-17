var value: String? = null
fun main(){
    value = "Kotlin"

    println(value?.length)
    value?.let{
        println(it.length)
    }
    val length = if(value!=null)
    {
        value!!.length
    } else {
        -1
    }
    println(length)

    val length2 = value?.length?: -1
    println(length2)

    lateinit var lateValue: String
    lateValue = "Java"
    println(lateValue.length)

    val int = 5
    val int2 = 5
    val sum = int + int2
    println(sum)

    val a = 4
    val b = 2
    val c = a - b
    println(c)
}







