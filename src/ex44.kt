fun main() {
    var totalIdades = 0
    var contagemAlunos = 0

    while (true) {
        print("Digite a idade do aluno (999 para parar): ")
        val idade = readLine()!!.toInt()

        if (idade == 999) break

        totalIdades += idade
        contagemAlunos++
    }

    if (contagemAlunos > 0) {
        val mediaIdade = totalIdades / contagemAlunos
        println("Número de alunos: $contagemAlunos")
        println("Média de idade: $mediaIdade")
    } else {
        println("Nenhuma idade foi registrada.")
    }
}
