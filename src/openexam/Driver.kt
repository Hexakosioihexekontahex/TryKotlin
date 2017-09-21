package openexam

class Driver(name: String) : User(name) {

    override val age: Int = 26

    override fun getAddress(): String {
        return "Test2"
    }

    override fun toString(): String {
        return "Driver(age='$age', name='$name')"
    }
}