fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readLine()!!.toInt()

    print("Digite a razão da PA: ")
    val razao = readLine()!!.toInt()

    var soma = 0
    var termo = primeiroTermo

    println("Os 10 primeiros termos da PA são:")
    for (i in 1..10) {
        print("$termo ")
        soma += termo
        termo += razao
    }

    println("\nA soma dos 10 primeiros termos da PA é: $soma")
}
