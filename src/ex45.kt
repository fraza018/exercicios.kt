fun main() {
    var maiorIdade = 0
    var contagemHomens = 0
    var menorIdadeMulher = Int.MAX_VALUE
    var somaIdadesHomens = 0
    var continuar: String

    do {
        print("Digite o sexo da pessoa (M/F): ")
        val sexo = readLine()!!

        print("Digite a idade da pessoa: ")
        val idade = readLine()!!.toInt()

        if (sexo == "M" || sexo == "m") {
            contagemHomens++
            somaIdadesHomens += idade
            if (idade > maiorIdade) maiorIdade = idade
        } else if (sexo == "F" || sexo == "f") {
            if (idade < menorIdadeMulher) menorIdadeMulher = idade
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!

    } while (continuar.equals("S", ignoreCase = true))

    val mediaIdadeHomens = if (contagemHomens > 0) somaIdadesHomens / contagemHomens else 0

    println("Maior idade: $maiorIdade")
    println("Número de homens cadastrados: $contagemHomens")
    println("Idade da mulher mais jovem: $menorIdadeMulher")
    println("Média de idade entre os homens: $mediaIdadeHomens")
}
