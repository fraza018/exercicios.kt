fun main() {
    // Chamando o procedimento Gerador() para repetir a mensagem 4 vezes
    Gerador("Aprendendo Kotlin", 4)
}

fun Gerador(mensagem: String, repeticoes: Int) {
    println("+ ======= +")
    for (i in 1..repeticoes) {
        println(mensagem)
    }
    println("+ ======= +")
}
