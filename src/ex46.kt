fun main() {
    var nomeMaisVelho = ""
    var nomeMulherMaisJovem = ""
    var maiorIdade = 0
    var menorIdadeMulher = Int.MAX_VALUE
    var somaIdades = 0
    var contagemPessoas = 0
    var homensMaisDe30 = 0
    var mulheresMenosDe18 = 0
    var continuar: String

    do {
        print("Digite o nome da pessoa: ")
        val nome = readLine()!!

        print("Digite a idade da pessoa: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo da pessoa (M/F): ")
        val sexo = readLine()!!

        somaIdades += idade
        contagemPessoas++

        if (idade > maiorIdade) {
            maiorIdade = idade
            nomeMaisVelho = nome
        }

        if (sexo == "M" || sexo == "m") {
            if (idade > 30) homensMaisDe30++
        } else if (sexo == "F" || sexo == "f") {
            if (idade < menorIdadeMulher) {
                menorIdadeMulher = idade
                nomeMulherMaisJovem = nome
            }
            if (idade < 18) mulheresMenosDe18++
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!

    } while (continuar.equals("S", ignoreCase = true))

    val mediaIdade = if (contagemPessoas > 0) somaIdades / contagemPessoas else 0

    println("Nome da pessoa mais velha: $nomeMaisVelho")
    println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    println("Média de idade do grupo: $mediaIdade")
    println("Homens com mais de 30 anos: $homensMaisDe30")
    println("Mulheres com menos de 18 anos: $mulheresMenosDe18")
}
