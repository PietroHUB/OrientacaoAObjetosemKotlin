fun main(args: Array<String>) {
    println("Hello ${args[0]}!")

    val resultadoSoma = avaliacao(Soma(Soma(Number(1), Number(2)), Number(4)))
    val resultadoSubtracao = avaliacao(Subtracao(Number(100) , Number(60)))
    println("Resultado será: ${resultadoSoma}")
    println("Resultado será: ${resultadoSubtracao}")
}

interface Expressao
class Number(val valor: Int): Expressao
class Soma(val esquerdo: Expressao , val direito: Expressao): Expressao
class Subtracao(val primeiro: Expressao , val segundo: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int {
    if(expressao is Number) {
        return expressao.valor
    }
    if (expressao is Soma) {
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }
    if (expressao is Subtracao){
        return avaliacao(expressao.primeiro) - avaliacao(expressao.segundo)
    }
    throw IllegalArgumentException("Expressão desconhecida!")
}