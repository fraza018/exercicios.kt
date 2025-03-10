fun main() {
    print("Digite o número de horas de atividade física no mês: ")
    val horasAtividade = readLine()!!.toInt()

    val pontosPorHora = when {
        horasAtividade <= 10 -> 2
        horasAtividade in 11..20 -> 5
        else -> 10
    }

    val totalPontos = horasAtividade * pontosPorHora
    val dinheiro = totalPontos * 0.05

    println("Você acumulou $totalPontos pontos, o que equivale a R$ ${"%.2f".format(dinheiro)}")
}
