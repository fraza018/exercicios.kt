fun main() {
    print("Digite a quantidade de Km percorridos: ")
    val km = readLine()!!.toDouble()

    print("Digite a quantidade de dias de aluguel: ")
    val dias = readLine()!!.toInt()

    val precoTotal = (dias * 90) + (km * 0.20)
    println("Preço total a pagar: R$ ${"%.2f".format(precoTotal)}")
}
