fun main() {
    print("Digite uma distância em metros: ")
    val metros = readLine()!!.toDouble()

    println("A distância de ${metros}m corresponde a:")
    println("${metros / 1000} Km")
    println("${metros / 100} Hm")
    println("${metros / 10} Dam")
    println("${metros * 10} dm")
    println("${metros * 100} cm")
    println("${metros * 1000} mm")
}
