fun main() {
    var somaIdades = 0
    var contagemIdades = 0
    var pessoasCom21 = 0
    var continuar: String

    do {
        print("Digite a idade da pessoa: ")
        val idade = readLine()!!.toInt()

        somaIdades += idade
        contagemIdades++

        if (idade >= 21) pessoasCom21++

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!
    } while (continuar.equals("S", ignoreCase = true))

    val mediaIdades = somaIdades / contagemIdades
    println("Quantas idades foram digitadas: $contagemIdades")
    println("Média das idades: $mediaIdades")
    println("Pessoas com 21 anos ou mais: $pessoasCom21")
}
