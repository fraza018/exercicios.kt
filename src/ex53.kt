fun main() {
    print("Digite um valor: ")
    val numero = readLine()!!.toInt()

    print("Contagem: ")
    for (i in 0..numero) {
        print("$i ")
    }
    println("FIM!")
}
