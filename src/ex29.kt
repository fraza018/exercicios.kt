fun main() {
    print("Digite o valor da casa: R$ ")
    val valorCasa = readLine()!!.toDouble()

    print("Digite o salário do comprador: R$ ")
    val salario = readLine()!!.toDouble()

    print("Digite em quantos anos ele vai pagar: ")
    val anos = readLine()!!.toInt()

    val prestacaoMensal = valorCasa / (anos * 12)
    if (prestacaoMensal > salario * 0.30) {
        println("Empréstimo negado. A prestação mensal é muito alta.")
    } else {
        println("Empréstimo aprovado! A prestação mensal será R$ ${"%.2f".format(prestacaoMensal)}")
    }
}
