import interfaces.MyInterface

class Aa : MyInterface {
    override val prop: Int
        get() = 2

    override fun fun1() {
        println("A")
    }
}