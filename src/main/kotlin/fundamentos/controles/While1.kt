package fundamentos.controles

fun main() {
    var opcao: Int = 0

    // utilizamos o comando while para quantidades
    // indeterminadas

    while(opcao != -1) {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao")
    }
    println("Até a próxima!")
}