fun main() {
    println(introduction("Caroline",23))

    serveDrinks(2)
    serveDrinks(15)
    serveDrinks(45)

    println(identity(arrayOf("Caroline","Njuguna","Ng'endo","Kamau")))

    println(product(67,69))
    println(divide(5,45))
    println(modulus(45,23))

    var person=Human("Njuguna",23,57)
    person.eat(9)
    person.speak("I am a Kenyan citizen")
    person.birthday()

    println(comparison(96,67))

    println(game("paper"))
}
fun introduction(name:String,age:Int):String{
    var name= "My name is $name and I am $age years old."
    return name
}

fun serveDrinks(age:Int) {
    when (age) {
        in (1..5) -> println("milk")
        in (6..15) -> println("fanta")
        else -> println("cocacola")

    }
}

fun identity(names:Array<String>):Int {
    var total = 0
    for (name in names) {
        if (name.length>4) {
            total++
        }
    }
    return total
}

fun product(num1:Int,num2:Int):Int{
    return num1*num2

}
fun divide(num3:Int,num4:Int):Int{
    return num3/num4
}
fun modulus(num5:Int,num6:Int):Int{
    return num5%num6
}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight = foodWeight + weight
        println(weight)
    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday() {
        println(age+1)
    }
}

fun comparison(num7:Int,num8:Int):Int{
    return num7-num8
}

fun game(player1:String, player2:String):String{
    var game="Rock-Paper-Scissors"
    if (player1=="Rock")
        println("you win")
    if (player2=="Paper")
        println("you lose")
    else ("you both win")
}
  return (game)
}