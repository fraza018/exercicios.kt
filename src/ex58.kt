fun main() {
    val vetor = IntArray(10)

    for (i in 0 until vetor.size) {
        vetor[i] = (i + 1) * 5
    }

    println("Vetor com múltiplos de 5: ${vetor.joinToString(" ")}")
}
