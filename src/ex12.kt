fun main() {
    print("Digite o preço do produto: R$ ")
    val preco = readLine()!!.toDouble()

    val desconto = preco * 0.05
    val precoFinal = preco - desconto

    println("O preço com 5% de desconto é: R$ $precoFinal")
}
