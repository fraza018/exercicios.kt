fun main() {
    print("Digite a velocidade do carro: ")
    val velocidade = readLine()!!.toInt()

    if (velocidade > 80) {
        val multa = (velocidade - 80) * 5
        println("Você foi multado! O valor da multa é R$ ${"%.2f".format(multa)}")
    } else {
        println("Você está dentro do limite de velocidade.")
    }
}
