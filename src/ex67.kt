fun main() {
    val idades = IntArray(8)
    var somaIdades = 0

    for (i in 0 until idades.size) {
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
        somaIdades += idades[i]
    }

    val mediaIdade = somaIdades / idades.size
    println("Média de idade: $mediaIdade")

    println("Posições com pessoas com mais de 25 anos:")
    for (i in idades.indices) {
        if (idades[i] > 25) {
            println("Posição ${i + 1}: ${idades[i]}")
        }
    }

    val maiorIdade = idades.maxOrNull() ?: 0
    println("Maior idade: $maiorIdade")

    println("Posições com a maior idade:")
    for (i in idades.indices) {
        if (idades[i] == maiorIdade) {
            println("Posição ${i + 1}")
        }
    }
}
