fun main() {
    val notas = DoubleArray(10)

    for (i in 0 until notas.size) {
        print("Digite a nota do ${i + 1}º aluno: ")
        notas[i] = readLine()!!.toDouble()
    }

    val mediaTurma = notas.average()
    println("Média da turma: $mediaTurma")

    val alunosAcimaDaMedia = notas.count { it > mediaTurma }
    println("Alunos acima da média: $alunosAcimaDaMedia")

    val maiorNota = notas.maxOrNull() ?: 0.0
    println("Maior nota: $maiorNota")

    println("Posições com a maior nota:")
    for (i in notas.indices) {
        if (notas[i] == maiorNota) {
            println("Posição ${i + 1}")
        }
    }
}
