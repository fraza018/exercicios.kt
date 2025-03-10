fun main() {
    print("Digite quanto dinheiro você tem na carteira (em R$): ")
    val reais = readLine()!!.toDouble()

    val dolar = 3.45
    val dolares = reais / dolar
    println("Com R$$reais, você pode comprar US$$dolares")
}
