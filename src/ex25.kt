fun main() {
    print("Digite o comprimento do primeiro segmento de reta: ")
    val a = readLine()!!.toInt()

    print("Digite o comprimento do segundo segmento de reta: ")
    val b = readLine()!!.toInt()

    print("Digite o comprimento do terceiro segmento de reta: ")
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && b + c > a) {
        println("É possível formar um triângulo.")
    } else {
        println("Não é possível formar um triângulo.")
    }
}
