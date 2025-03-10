fun main() {
    print("Digite o nome do cliente: ")
    val nome = readLine()!!

    print("Digite o sexo (M/F): ")
    val sexo = readLine()!!

    print("Digite o valor das compras: ")
    val valorCompras = readLine()!!.toDouble()

    val desconto = if (sexo.equals("M", ignoreCase = true)) {
        valorCompras * 0.05
    } else {
        valorCompras * 0.13
    }

    val totalComDesconto = valorCompras - desconto
    println("O total a pagar para $nome com desconto é: R$ ${"%.2f".format(totalComDesconto)}")
}
