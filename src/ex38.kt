fun main() {
    print("Digite um número inteiro e positivo: ")
    val numero = readLine()!!.toInt()

    for (i in 1..numero) {
        print("$i ")
    }
    println("Acabou!")
}
