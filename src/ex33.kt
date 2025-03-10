fun main() {
    print("Digite o salário atual do funcionário: R$ ")
    val salario = readLine()!!.toDouble()

    print("Digite o gênero do funcionário (M/F): ")
    val genero = readLine()!!

    print("Digite o tempo de empresa (em anos): ")
    val anosDeEmpresa = readLine()!!.toInt()

    val aumento = if (genero == "F") {
        when {
            anosDeEmpresa < 15 -> salario * 0.05
            anosDeEmpresa in 15..20 -> salario * 0.12
            else -> salario * 0.23
        }
    } else {
        when {
            anosDeEmpresa < 20 -> salario * 0.03
            anosDeEmpresa in 20..30 -> salario * 0.13
            else -> salario * 0.25
        }
    }

    val novoSalario = salario + aumento
    println("O novo salário do funcionário é: R$ ${"%.2f".format(novoSalario)}")
}
