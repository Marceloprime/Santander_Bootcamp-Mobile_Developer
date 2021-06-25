/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
	val number1:Float= 4.00f
    val number2:Float=20.00f
    
    calculate(number1?:0.00f,number2?:0.00f,1)
    calculate(number1?:0.00f,number2?:0.00f,2)
    calculate(number1?:0.00f,number2?:0.00f,3)
	calculate(number1?:0.00f,number2?:0.00f,4)

}

fun calculate(n1:Float, n2:Float, operation:Int){
    if((n1 == null) ||(n2 == null)){
		println("Erro, valor nulo")
    }
    else{
        when{
            operation == 1 -> println(n1.plus(n2))//soma
            operation == 2 -> println(n1 - n2)//subtração
            operation == 3 -> println(n1 / n2)//Dvisão
            operation == 4 -> println(n1 * n2)//Multiplicação
        }
    }
}