fun main() {
    print("Digite o nome do aluno: ")
    val nome = readLine()!!

    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2
    println("A média do aluno $nome é: ${"%.2f".format(media)}")

    if (media >= 7.0) {
        println("Aproveitamento: Bom!")
    } else {
        println("Aproveitamento: Regular")
    }
}
