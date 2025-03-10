fun main() {
    // Leitura dos números
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    // Chamando a função SuperSomador() e exibindo o resultado
    val resultado = SuperSomador(num1, num2)
    println("A soma dos números entre $num1 e $num2 é: $resultado")
}

fun SuperSomador(a: Int, b: Int): Int {
    var soma = 0
    for (i in a..b) {
        soma += i
    }
    return soma
}
