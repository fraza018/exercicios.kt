fun main() {
    // Leitura da base e do expoente
    print("Digite a base: ")
    val base = readLine()!!.toInt()

    print("Digite o expoente: ")
    val expoente = readLine()!!.toInt()

    // Chamando a função Potencia() e exibindo o resultado
    val resultado = Potencia(base, expoente)
    println("O resultado de $base elevado a $expoente é: $resultado")
}

fun Potencia(base: Int, expoente: Int): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}
