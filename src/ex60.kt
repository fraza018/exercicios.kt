fun main() {
    val vetor = IntArray(10)

    for (i in 0 until vetor.size) {
        vetor[i] = if (i % 2 == 0) 5 else 3
    }

    println("Vetor alternado: ${vetor.joinToString(" ")}")
}
