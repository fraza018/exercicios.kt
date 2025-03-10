fun main() {
    // Chamando o procedimento Gerador() com borda 3 e repetindo a mensagem 4 vezes
    Gerador("Portugol Studio", 4, 3)
}

fun Gerador(mensagem: String, repeticoes: Int, borda: Int) {
    val bordas = when (borda) {
        1 -> "+-------=======------+"
        2 -> "~~~~~~~~:::::::~~~~~~~"
        3 -> "<<<<<<<------>>>>>"
        else -> "+ ======= +"
    }

    println(bordas)
    for (i in 1..repeticoes) {
        println(mensagem)
    }
    println(bordas)
}
