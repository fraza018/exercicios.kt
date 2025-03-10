fun main() {
    print("Digite o tipo de carro (popular ou luxo): ")
    val tipoCarro = readLine()!!

    print("Digite o número de dias de aluguel: ")
    val dias = readLine()!!.toInt()

    print("Digite a quantidade de Km percorridos: ")
    val km = readLine()!!.toInt()

    val precoAluguel = if (tipoCarro == "popular") {
        90 * dias + if (km <= 100) km * 0.20 else km * 0.10
    } else {
        150 * dias + if (km <= 200) km * 0.30 else km * 0.25
    }

    println("O preço a ser pago é: R$ ${"%.2f".format(precoAluguel)}")
}
