import kotlin.random.Random

fun main() {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    println("Escolha: Pedra, Papel ou Tesoura")
    val escolhaJogador = readLine()!!

    val escolhaComputador = opcoes[Random.nextInt(0, 3)]
    println("Computador escolheu: $escolhaComputador")

    when {
        escolhaJogador == escolhaComputador -> println("Empate!")
        escolhaJogador == "Pedra" && escolhaComputador == "Tesoura" -> println("Você venceu!")
        escolhaJogador == "Papel" && escolhaComputador == "Pedra" -> println("Você venceu!")
        escolhaJogador == "Tesoura" && escolhaComputador == "Papel" -> println("Você venceu!")
        else -> println("Você perdeu!")
    }
}
