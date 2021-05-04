//esse exemplo usa o ENUM de Cores desse projeto
fun main(){
    println("Entendendo o when do Kotlin!")

    println("FUNÇÃO SIMPLES: ${obterMnemonicaSimples(Cores.VERMELHO)}")
    println("FUNÇÃO COM CORPO: ${obterMnemonicaNormal(Cores.VERDE)} & ${obterMnemonicaNormal(Cores.AMARELO)}")
    println("Com mais de uma opção no when: ${obterTemperaturas(Cores.LARANJA)}")
    println("Com mais de uma opção no when: ${obterTemperaturas(Cores.AZUL)}")
    println("Com mais de uma opção no when: ${obterTemperaturas(Cores.VERDE)}")
}

fun obterMnemonicaSimples(cores: Cores): String =
    when(cores){
        Cores.VERMELHO -> "Red"
        Cores.AMARELO -> "Yellow"
        Cores.AZUL -> "Azul"
        Cores.LARANJA -> "Laranja"
        Cores.VERDE -> "Green"
    }

fun obterMnemonicaNormal(cores: Cores):String{
    return when(cores){
        Cores.VERMELHO -> "Red"
        Cores.AMARELO -> "Yellow"
        Cores.AZUL -> "Azul"
        Cores.LARANJA -> "Laranja"
        Cores.VERDE -> "Green"
    }
}

fun obterTemperaturas(cores: Cores):String{
    return when(cores){
        Cores.VERMELHO , Cores.AMARELO , Cores.LARANJA -> "Quente!"
        Cores.AZUL -> "Neutro!"
        Cores.VERDE -> "Frio!"
    }
}