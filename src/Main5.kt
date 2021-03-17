fun main(){
   val score = -5
    if(score >= 90 && score <= 100){
        println("5")
    }else if(score >=70 && score <90) {
        println("4")
    }else if(score >=50 && score <70) {
        println("3")
    }else if(score >=30 && score <50) {
        println("2")
    }else if(score >=0 && score <30) {
        println("1")
    }else{
        println("invalid score")
    }

    val a = 5
    val b = 3

    val maxValue = if(a>b) {
        println("a is bigger")
        a
    }
    else
        b

    println("Введите четырехзначное число")
    val num = readLine()!!.toInt()
    val result: Boolean
    if(num % 10 + num / 10 % 10 == num / 100%10 + num / 1000)
    {
        result = true
    } else {
        result = false
    }
    println(result)

    val age = readLine()!!.toInt()
    if (age >= 1 && age <= 200) {
        val lastDigit: Int = age % 10
        println(lastDigit)
        var ageStr = ""

        if (age - lastDigit == 10 || age - lastDigit == 110) {
            ageStr = "лет"
        } else if (lastDigit == 0) {
            ageStr = "лет"
        } else if (lastDigit == 1) {
            ageStr = "год"
        } else if (lastDigit <= 4) {
            ageStr = "года"
        } else {
            ageStr = "лет"
        }
        println("Вывод: $age = $ageStr")
    } else {
        println("Число не может быть больше 200 или меньше 1")

    }
    }
