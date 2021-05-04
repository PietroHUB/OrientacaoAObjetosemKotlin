/*@PLima*/

//vamos aprender as repetições
//https://www.youtube.com/watch?v=kDKjzHRIQ-M&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=15

fun main(args: Array<String>){

    //println( While_Sample())
    //println( Do_While_Sample())
    For_Sample()
}

fun While_Sample(): String{
    var temp: Int = 0
    var soma: Int = 0
    var qnt: Int = 0
    while(temp != 999){
        print("Digite uma temperatura ou 999 para sair: ")
        temp = readLine()!!.toInt()

        if(temp != 999){
            soma += temp //soma do total + a temperatura digitada
            qnt++ //quantidade
        }
    }
    //informando resultado do while
    return "A média das temperaturas ${soma} / ${qnt} é: ${soma/qnt}"
}

fun Do_While_Sample(): String{
    var temp: Int
    var soma: Int = 0
    var qnt: Int = 0
    do {
        print("Digite uma temperatura ou 999 para sair: ")
        temp = readLine()!!.toInt()

        if(temp != 999){
            soma += temp //soma do total + a temperatura digitada
            qnt++ //quantidade
        }
    }while (temp != 999)
    //informando resultado do while
    return "A média das temperaturas é: ${soma}/${qnt} é: ${soma/qnt}"
}

//numeros divisiveis por 15 ele imprime FizzBuzz
//numeros divisiveis por 3 ele imprime Fizz
//numeros divisiveis por 5 ele imprime Buzz
//Caso contrario ele imprime o número
fun For_Sample(){
    for (numero in 1..100){
        println(fizzBuzz(numero))
    }
}

fun fizzBuzz(numero: Int) = when{
    numero % 15 == 0 -> {println("FizzBuzz")}
    numero % 3 == 0 -> "Fizz "
    numero % 5 == 0 -> "Buzz"
    else -> "$numero"
}