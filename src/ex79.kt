fun main() {
    // Leitura dos valores de início, fim e incremento
    print("Digite o valor de início: ")
    val inicio = readLine()!!.toInt()

    print("Digite o valor de fim: ")
    val fim = readLine()!!.toInt()

    print("Digite o valor de incremento: ")
    val incremento = readLine()!!.toInt()

    // Chamando o procedimento Contador()
    Contador(inicio, fim, incremento)
}

fun Contador(inicio: Int, fim: Int, incremento: Int) {
    for (i in inicio..fim step incremento) {
        print("$i >> ")
    }
    println("FIM")
}
