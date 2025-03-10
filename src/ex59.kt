fun main() {
    val vetor = IntArray(10)

    for (i in 0 until vetor.size) {
        vetor[i] = 9 - i
    }

    println("Vetor em ordem decrescente: ${vetor.joinToString(" ")}")
}
