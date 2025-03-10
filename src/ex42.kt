fun main() {
    var soma = 0
    var numero: Int

    do {
        print("Digite um número (1111 para parar): ")
        numero = readLine()!!.toInt()
        if (numero != 1111) {
            soma += numero
        }
    } while (numero != 1111)

    println("O somatório dos números digitados é: $soma")
}
