/*@PLima*/

fun main(args: Array<String>) {
    println("Hello @PLima!")
    val resultadoSoma2 = avaliacao2(Soma2(Soma2(Number2(1), Number2(2)), Number2(4)))
    val resultadoSubtracao2 = avaliacao2(Subtracao2(Number2(100) , Number2(101)))
    println("Soma: ${resultadoSoma2}")
    println("Subtração: ${resultadoSubtracao2}")
}

interface Expressao2
class Number2(val valor: Int): Expressao2
class Soma2(val esquerdo: Expressao2, val direito: Expressao2): Expressao2
class Subtracao2(val primeiro: Expressao2, val segundo: Expressao2): Expressao2

fun avaliacao2(expressao2: Expressao2): Int {
    return when(expressao2){
        is Number2 -> {
            println("Expressao com numero ${expressao2.valor}")
            expressao2.valor
        }
        is Soma2 ->{ avaliacao2(expressao2.esquerdo) + avaliacao2(expressao2.direito) }
        is Subtracao2 -> { avaliacao2(expressao2.primeiro) - avaliacao2(expressao2.segundo) }
        else -> throw IllegalArgumentException("Expressão desconhecida!")
    }
}