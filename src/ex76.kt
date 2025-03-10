fun main() {
    // Leitura dos valores
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    // Chamando o procedimento Somador() para calcular a soma
    Somador(valor1, valor2)
}

fun Somador(a: Int, b: Int) {
    val soma = a + b
    println("A soma entre $a e $b é: $soma")
}
