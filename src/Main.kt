import animals.cats.CatA
import animals.*
import Color.*

fun main(args: Array<String>){

    greeting("Kotlin")

    sum(10, 14)

    showUserJava("wolfgunmiller@gmail.com")

    showUserKotlin("M-i-l-l-e-r@mail.ru")

    createSomeVals()

    println(function())

    println(function2(13123))

    println(function3(3123, 213.123))

    npe()

    val person = Person("Roman", "Melnik", 26)
    println(person)
    val car = Car(9.2, 10)
    car.isNew = false

    val catA = CatA()
    catA.a1()

    superMethod1()
    superMethod2()
    someMethodsWithColors()

    compareInts(5, 6)
    compareInts(6, 6)
    compareInts(5, 5)
    compareInts(1, 0)
    compareInts(34123, 34113)

}


fun greeting(name: String){
    println("Hello, $name!")
}

fun sum(a: Int, b: Int){
    println("A + B = ${a + b}")
}

fun showUserJava(email: String){
    val userJava = UserJava(email)
    println("userJava.email - ${userJava.email}")
//    userJava.email = "";
}

fun showUserKotlin(email: String){
    val userKotlin = UserKotlin(email)
    println("userKotlin.email - ${userKotlin.email}")
//    userKotlin.email = "123123"
}

fun createSomeVals(){
    val a0: Byte = 1 //8
    val a1: Short = 2 //16
    val a2: Int = 3 //32
    val a3: Float = 12312.12312F //32
    val a4: Double = 3.2 //64
    val a5: Long = 123321123213 //64

    val a2toShort = a2.toShort()

    val a6: Boolean = false

    val a7: Char = 'u'

    val a8: String = "sdf32f2"

    println("a0 = $a0, a1 = $a1, a2 = $a2, a3 = $a3, a4 = $a4, a5 = $a5")
    println("a2 = $a2, a2.toShort() = $a2toShort")
    println("a6 = $a6, a7 = $a7, a8 = $a8")

}

fun function(): Int {
    return 1
}

fun function2(a: Long): Int{
    return a.toInt()
}

fun function3(a:Long, b:Double) = a + b

fun npe(){
    val st: String?
    st = getSt()
    val size = st!!.length

    println(size)
}

fun getSt(): String? {
    return "sdfsd"
}

fun someMethodsWithColors() {

    println(Color.BLACK.name)
    println(Color.BLACK.colorHex)
    println(Color.BLACK.opacity)
    Color.BLACK.some()

    getFavouriteColor(Color.GREEN)
}

fun getFavouriteColor(color: Color) = when(color) {
    BLACK, WHITE -> println("Черный или Белый")
    RED, GREEN -> println("Красный или Зелёный")
}

fun compareInts(a: Int, b: Int){
    when{
        (a > b) -> println("$a > $b")
        (a < b) -> println("$a < $b")
        (a == b) -> println("$a == $b")
    }
}