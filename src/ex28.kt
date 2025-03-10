import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 6)
    println("Tente adivinhar o número sorteado entre 1 e 5.")
    val palpite = readLine()!!.toInt()

    if (palpite == numeroSorteado) {
        println("Parabéns, você acertou!")
    } else {
        println("Você errou. O número sorteado foi: $numeroSorteado")
    }
}
