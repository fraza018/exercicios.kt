fun main() {
    print("Digite o seu ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()
    val idade = 2025 - anoNascimento

    if (idade >= 18) {
        println("Você pode votar!")
    } else {
        println("Você não pode votar.")
    }
}
