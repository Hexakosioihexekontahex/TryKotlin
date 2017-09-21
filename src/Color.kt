enum class Color(var colorHex: String, var opacity: Double? = 1.0) {

    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#00FF00", 0.5),
    GREEN("#0000FF", 0.3);

    fun some(){
        println("my logic")
    }

}