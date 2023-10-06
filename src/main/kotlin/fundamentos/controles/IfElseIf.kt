package fundamentos.controles

fun main() {
    val nota: Double = 8.3

    // Usando operador range
    if (nota.toInt() in 9..10) {
        println("Fantástico")
    } else if (nota.toInt() in 7.. 8) {
        println("Parabéns")
    } else if (nota.toInt() in 4..6) {
        println("Tem como recuperar")
    } else if (nota.toInt() in 0..3) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida!")
    }

    println(5 in 7..4)
    println(5 in 4..7)
}