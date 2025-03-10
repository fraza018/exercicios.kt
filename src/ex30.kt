fun main() {
    print("Digite o peso (em kg): ")
    val peso = readLine()!!.toDouble()

    print("Digite a altura (em metros): ")
    val altura = readLine()!!.toDouble()

    val imc = peso / (altura * altura)

    println("Seu IMC é: ${"%.2f".format(imc)}")

    when {
        imc < 18.5 -> println("Abaixo do peso")
        imc in 18.5..25 -> println("Peso ideal")
        imc in 25..30 -> println("Sobrepeso")
        imc in 30..40 -> println("Obesidade")
        else -> println("Obesidade mórbida")
    }
}
