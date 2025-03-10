fun main() {
    val numeros = IntArray(10)

    for (i in 0 until numeros.size) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    println("Números pares e suas posições:")
    for (i in 0 until numeros.size) {
        if (numeros[i] % 2 == 0) {
            println("Posição ${i + 1}: ${numeros[i]}")
        }
    }
}
