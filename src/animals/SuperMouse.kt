package animals

internal class SuperMouse : Mouse() {
    fun funB(){
        println("Supertext")
        funA()
    }
}