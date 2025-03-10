fun main() {
    // Testando o procedimento Fibonacci()
    print("Quantos termos você quer mostrar? ")
    val termos = readLine()!!.toInt()
    Fibonacci(termos)
}

fun Fibonacci(n: Int) {
    var a = 0
    var b = 1
    for (i in 1..n) {
        print("$a >> ")
        val temp = a
        a = b
        b = temp + b
    }
    println("FIM") // Coloca FIM após a sequência
}
