package interfaces

interface MyInterface {
    val prop: Int
        get() = 3
    fun fun1()
    fun fun2(){
        println("default")
    }
}