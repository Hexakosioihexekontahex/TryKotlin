package abstracts

open abstract class BaseTemplate {
    var count = 0

    fun a(){
        count++
        println("Count: $count")
    }

    abstract fun minus()
}