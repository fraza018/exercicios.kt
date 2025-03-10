fun main() {
    // Leitura dos valores
    print("Digite o primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull() ?: return println("Valor inválido para o primeiro número.")

    print("Digite o segundo valor: ")
    val valor2 = readLine()?.toIntOrNull() ?: return println("Valor inválido para o segundo número.")

    // Chama a função Somador() e exibe o resultado
    val resultado = Somado(valor1, valor2)
    println("A soma entre $valor1 e $valor2 é: $resultado")
}

fun Somado(a: Int, b: Int): Int {
    return a + b
}
