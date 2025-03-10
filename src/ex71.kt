fun main() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = DoubleArray(5)

    for (i in 0 until 5) {
        print("Digite o nome do funcionário ${i + 1}: ")
        nomes[i] = readLine()!!

        print("Digite o sexo (M/F) do funcionário ${i + 1}: ")
        sexos[i] = readLine()!!

        print("Digite o salário do funcionário ${i + 1}: R$ ")
        salarios[i] = readLine()!!.toDouble()
    }

    println("Funcionárias mulheres que ganham mais de R$5.000:")
    for (i in 0 until 5) {
        if (sexos[i] == "F" && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Salário: R$ ${salarios[i]}")
        }
    }
}
