fun main() {
    print("Nome do Funcionário: ")
    val nome = readLine()!!

    print("Salário: ")
    val salario = readLine()!!.toDouble()

    println("O funcionário $nome tem um salário de R$$salario em Junho.")
}
