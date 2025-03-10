fun main() {
    var soma = 0
    var menorValor = Int.MAX_VALUE
    var somaPares = 0
    var contagemValores = 0
    var continuar: String

    do {
        print("Digite um número: ")
        val numero = readLine()!!.toInt()

        soma += numero
        contagemValores++

        if (numero < menorValor) menorValor = numero
        if (numero % 2 == 0) somaPares++

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!
    } while (continuar.equals("S", ignoreCase = true))

    val media = soma / contagemValores
    println("Somatório dos valores: $soma")
    println("Menor valor digitado: $menorValor")
    println("Média dos valores: $media")
    println("Quantos valores são pares: $somaPares")
}
