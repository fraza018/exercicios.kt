fun main() {
    print("Digite o comprimento do primeiro segmento de reta: ")
    val a = readLine()!!.toInt()

    print("Digite o comprimento do segundo segmento de reta: ")
    val b = readLine()!!.toInt()

    print("Digite o comprimento do terceiro segmento de reta: ")
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            println("O triângulo é EQUILÁTERO.")
        } else if (a == b || b == c || a == c) {
            println("O triângulo é ISÓSCELES.")
        } else {
            println("O triângulo é ESCALENO.")
        }
    } else {
        println("Não é possível formar um triângulo.")
    }
}
