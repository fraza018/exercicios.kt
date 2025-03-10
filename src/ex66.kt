import kotlin.random.Random

fun main() {
    val vetor = IntArray(30) { Random.nextInt(1, 16) }  // Números entre 1 e 15

    println("Vetor preenchido: ${vetor.joinToString(" ")}")

    print("Digite o número (chave) que você quer buscar: ")
    val chave = readLine()!!.toInt()

    var quantidade = 0
    println("Posições em que a chave foi encontrada:")
    for (i in vetor.indices) {
        if (vetor[i] == chave) {
            println("Posição ${i + 1}")
            quantidade++
        }
    }

    println("A chave foi encontrada $quantidade vezes.")
}
