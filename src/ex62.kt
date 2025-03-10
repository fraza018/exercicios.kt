import kotlin.random.Random

fun main() {
    val vetor = IntArray(7)

    for (i in 0 until vetor.size) {
        vetor[i] = Random.nextInt(1, 101)  // Números entre 1 e 100
    }

    println("Números aleatórios gerados: ${vetor.joinToString(" ")}")
}
