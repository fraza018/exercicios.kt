fun main() {
    var totalHomens = 0.0
    var totalMulheres = 0.0
    var continuar: String

    do {
        print("Digite o salário do funcionário: R$ ")
        val salario = readLine()!!.toDouble()

        print("Digite o sexo do funcionário (M/F): ")
        val sexo = readLine()!!

        if (sexo == "M" || sexo == "m") {
            totalHomens += salario
        } else if (sexo == "F" || sexo == "f") {
            totalMulheres += salario
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!
    } while (continuar.equals("S", ignoreCase = true))

    println("Total de salários pagos aos homens: R$ ${"%.2f".format(totalHomens)}")
    println("Total de salários pagos às mulheres: R$ ${"%.2f".format(totalMulheres)}")
}
