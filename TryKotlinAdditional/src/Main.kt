//import animals.SuperMouse

fun main(args: Array<String>){
//    var mouse = SuperMouse()
    /**
     * нельзя вызвать супер Мышь, потому что она internal,
     * т.е. только для своего модуля (TryKotlin)
    */

    cycle()

    cycle2()

    dataClassExample()

    sealedExpr()

}

fun cycle(){
    var index: Int = 0

    while (index < 10){
        print("Yo :) ")
        index++
    }
    println("|")

    do {
        print("YO =) ")
        index++
    } while (index<0)
    println("|")

    var nums = 1..10

    for(value in nums){
        print("$value ")
    }
    println("|")

    for(value in nums step(2)){
        print("$value ")
    }
    println("|")

    for(value in 10 downTo 1 step 3){
        print("$value ")
    }
    println("|")
}

fun cycle2(){
    var nums = 1..10
    val value = 3
//    for (num in nums){
//        if(num == value){
//            println(true)
//            break
//        }
//    }
    println(value in nums)

    val characters = 'a'..'z'
    val ch = 'h'
    println(isChar(ch, characters))

}


fun isChar(char: Char, characters: CharRange) :Boolean = char in characters

fun dataClassExample(){

    val person1 = Person("Roman", 26)
    println(person1)
    val person2 = person1
    println(person2)
    person2.age = 27
    println(person1)
    println(person2)

    println()

    val person3 = Person("Roman", 26)
    println(person3)
    val person4 = person3.copy(age = 4)
    println(person4)
    person4.age = 2
    println(person3)
    println(person4)

    println()

    val (name, age) = Person("Name", 0)
    println("My age = $age and my name $name")

}

fun sealedExpr(){
    val e1 = Expr.Const(1.2)
    val e2 = Expr.Const(2.2)
    val sum = Expr.Sum(e1, e2)
    println(sum)
    println(eval(sum))
    println(eval(e1))
    println(eval(e2))

}

fun eval(expr: Expr) :Double = when(expr){
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)

    Expr.NotANumber -> Double.NaN
}

