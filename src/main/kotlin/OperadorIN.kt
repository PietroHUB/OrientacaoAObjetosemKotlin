/*@PLima*/

fun main(){
//vamos verificar se o caractere está dentro da coleção

    println(ehLetra('9'))
    println(ehLetra('D'))
    println(naoEhNumero('0'))
    println(naoEhNumero('D'))

}

fun ehLetra( x : Char) = x in 'a'..'z' || x in 'A'..'Z'
fun naoEhNumero(x : Char) = x !in '0'..'9'

