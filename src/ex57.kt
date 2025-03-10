fun main() {
    val vetor = IntArray(8)

    // Preencher o vetor com 999
    for (i in 0..3) {
        vetor[i] = 999
    }

    // Preencher o vetor com 0, 1, 2, 3, 4, 5, 6, 7
    for (i in 4 until vetor.size) {
        vetor[i] = i - 4
    }

    // Mostrar o vetor
    println("Vetor preenchido: ${vetor.joinToString(" ")}")
}
