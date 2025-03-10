fun main() {
    print("Digite a largura da parede (em metros): ")
    val largura = readLine()!!.toDouble()

    print("Digite a altura da parede (em metros): ")
    val altura = readLine()!!.toDouble()

    val area = largura * altura
    val tinta = area / 2 // cada litro pinta 2m²

    println("A área a ser pintada é de $area m².")
    println("Você precisará de $tinta litros de tinta.")
}
