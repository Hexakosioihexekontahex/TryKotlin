package openexam

open class User(val name: String){

    open val age: Int = 0

    open fun getAddress(): String{
        return "Test"
    }

    override fun toString(): String {
        return "User(name='$name')"
    }
}