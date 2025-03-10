fun main() {
    // Leitura do valor
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    // Chamando o procedimento ParOuImpar() para verificar se o número é par ou ímpar
    ParOuImpar(numero)
}

fun ParOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("O número $numero é PAR.")
    } else {
        println("O número $numero é ÍMPAR.")
    }
}
