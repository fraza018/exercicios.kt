fun main() {
    print("Digite a quantidade de cigarros fumados por dia: ")
    val cigarrosPorDia = readLine()!!.toInt()

    print("Digite quantos anos você já fumou: ")
    val anosFumando = readLine()!!.toInt()

    val minutosPerdidosPorDia = cigarrosPorDia * 10
    val minutosPerdidosPorAno = minutosPerdidosPorDia * 365 * anosFumando
    val diasPerdidos = minutosPerdidosPorAno / (60 * 24)

    println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao fumo.")
}
