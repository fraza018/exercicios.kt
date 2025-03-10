fun main() {
    var mulheresCadastradas = 0
    var homensMaisDe100Kg = 0
    var somaPesoMulheres = 0.0
    var maiorPesoHomens = 0.0

    for (i in 1..8) {
        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!

        print("Digite o peso: ")
        val peso = readLine()!!.toDouble()

        if (sexo == "F" || sexo == "f") {
            mulheresCadastradas++
            somaPesoMulheres += peso
        } else if (sexo == "M" || sexo == "m") {
            if (peso > 100) homensMaisDe100Kg++
            if (peso > maiorPesoHomens) maiorPesoHomens = peso
        }
    }

    val mediaPesoMulheres = if (mulheresCadastradas > 0) somaPesoMulheres / mulheresCadastradas else 0.0

    println("Mulheres cadastradas: $mulheresCadastradas")
    println("Homens que pesam mais de 100kg: $homensMaisDe100Kg")
    println("Média de peso entre as mulheres: ${"%.2f".format(mediaPesoMulheres)}")
    println("Maior peso entre os homens: ${"%.2f".format(maiorPesoHomens)}")
}
