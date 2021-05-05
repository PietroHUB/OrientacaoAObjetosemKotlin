/*@PLima*/

//vamos aprender as repetições
//https://www.youtube.com/watch?v=kDKjzHRIQ-M&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=15

fun main(args: Array<String>){

    //println( While_Sample())
    //println( Do_While_Sample())
    //For_Sample()
    //iteratorArrayFor()
    iteratorArrayWhile()
    //ontandoComFor()
    //contandoComForDeTrazPraFrente()
}

fun contandoComFor() {
    for (num in 1..100){
        print("${num} ")
    }
}
fun contandoComForDeTrazPraFrente() {
    var numero = 100
    for (num in 1..numero){
        print(" ${numero} ")
        numero -= 1
    }
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

//iterando um array com for
fun iteratorArrayFor(){
    val numberArray = Array(4,{ i->i*2})
    for ( i in numberArray[0] until numberArray.size){
        println(numberArray[i])
    }
}
//iterando um array com while
fun iteratorArrayWhile() {
    val numberArray = Array(4) { i -> i * 5 }
    val numberInterator = numberArray.iterator()
    while (numberInterator.hasNext()) {
        println(numberInterator.next())
    }
}