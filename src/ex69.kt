import kotlin.random.Random

fun main() {
    val vetor = IntArray(20) { Random.nextInt(0, 100) }

    println("Vetor gerado: ${vetor.joinToString(" ")}")

    vetor.sort()

    println("Vetor ordenado: ${vetor.joinToString(" ")}")
}
