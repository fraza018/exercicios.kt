fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("O número $numero é PAR")
    } else {
        println("O número $numero é ÍMPAR")
    }
}
