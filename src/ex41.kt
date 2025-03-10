import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 4

    println("Tente adivinhar o número sorteado entre 1 e 10. Você tem $tentativas tentativas!")

    while (tentativas > 0) {
        print("Digite seu palpite: ")
        val palpite = readLine()!!.toInt()

        if (palpite == numeroSorteado) {
            println("Parabéns, você acertou o número!")
            break
        } else {
            tentativas--
            println("Você errou! Tentativas restantes: $tentativas")
        }

        if (tentativas == 0) {
            println("Suas tentativas acabaram! O número sorteado era: $numeroSorteado")
        }
    }
}
