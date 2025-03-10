fun main() {
    print("Digite seu ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()
    val idade = 2025 - anoNascimento

    if (idade < 18) {
        println("Faltam ${18 - idade} anos para o alistamento.")
    } else if (idade == 18) {
        println("É o ano do seu alistamento!")
    } else {
        println("Você deveria ter se alistado há ${idade - 18} anos.")
    }
}
