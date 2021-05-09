import java.lang.Exception
import java.lang.NumberFormatException

/*@PLima*/
fun main(){
    try{
        pedeDados()
    }catch (e: Exception){
        println("==========Error: ${e}")
    }
}

fun pedeDados(){
    println("Digite um número")
    val number : Int = readLine()!!.toInt()
    println(verificaNumber(number))
}

fun verificaNumber(number : Int): String{
    return if (number in 0..9){
        "Numero digitado: $number"
    }else{
        throw IllegalArgumentException("Numero digitado: $number deve estar entre 1 e 9!")
    }
}