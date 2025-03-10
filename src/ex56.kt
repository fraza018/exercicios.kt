fun main() {
    var a = 1
    var b = 1

    println("Os 10 primeiros termos da sequência de Fibonacci são:")
    print("$a $b ")

    for (i in 3..10) {
        val temp = a + b
        print("$temp ")
        a = b
        b = temp
    }
}
