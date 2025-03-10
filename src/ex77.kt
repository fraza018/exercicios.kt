fun main() {
    // Leitura dos valores
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    // Chamando o procedimento Maior() para verificar o maior valor
    Maior(valor1, valor2)
}

fun Maior(a: Int, b: Int) {
    when {
        a > b -> println("O maior valor é: $a")
        b > a -> println("O maior valor é: $b")
        else -> println("Os dois valores são iguais.")
    }
}
