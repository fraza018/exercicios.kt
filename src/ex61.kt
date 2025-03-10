fun main() {
    val fibonacci = IntArray(15)

    fibonacci[0] = 1
    fibonacci[1] = 1

    for (i in 2 until fibonacci.size) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    println("Sequência de Fibonacci (15 termos): ${fibonacci.joinToString(" ")}")
}
