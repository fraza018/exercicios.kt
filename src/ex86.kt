fun main() {
    // Leitura das notas com verificação de entrada
    print("Digite a primeira nota: ")
    val nota1 = readLine()?.toFloatOrNull() ?: return println("Entrada inválida para a primeira nota.")

    print("Digite a segunda nota: ")
    val nota2 = readLine()?.toFloatOrNull() ?: return println("Entrada inválida para a segunda nota.")

    // Chamando a função Media() para calcular a média
    val media = Media(nota1, nota2)

    // Chamando a função Situacao() para saber a situação do aluno
    val situacao = Situacao(media)

    println("A média do aluno é: $media")
    println("Situação: $situacao")
}

fun media(nota1: Float, nota2: Float): Float {
    return (nota1 + nota2) / 2
}

fun Situacao(media: Float): String {
    return when {
        media >= 7 -> "APROVADO"
        media >= 5 -> "RECUPERAÇÃO"
        else -> "REPROVADO"
    }
}
