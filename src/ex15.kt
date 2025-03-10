fun main() {
    print("Digite o número de dias trabalhados no mês: ")
    val diasTrabalhados = readLine()!!.toInt()

    val salario = diasTrabalhados * 8 * 25
    println("Salário total: R$ ${"%.2f".format(salario)}")
}
