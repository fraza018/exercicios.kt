fun main() {
    // Leitura dos três números
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()

    // Chamando a função Maior() e exibindo o maior número
    val maiorNumero = Maior(num1, num2, num3)
    println("O maior número é: $maiorNumero")
}

fun Maior(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)  // Função maxOf() encontra o maior valor entre os três
}
