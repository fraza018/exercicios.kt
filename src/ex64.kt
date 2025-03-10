fun main() {
    val numeros = IntArray(15)

    for (i in 0 until numeros.size) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    println("Valores múltiplos de 10:")
    for (i in 0 until numeros.size) {
        if (numeros[i] % 10 == 0) {
            println("Posição ${i + 1}: ${numeros[i]}")
        }
    }
}
