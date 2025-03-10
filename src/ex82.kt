fun main() {
    // Leitura das notas
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toFloat()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toFloat()

    // Chamando a função Media() e exibindo o resultado
    val media = Media(nota1, nota2)
    println("A média das notas é: $media")
}

fun Media(nota1: Float, nota2: Float): Float {
    return (nota1 + nota2) / 2
}
