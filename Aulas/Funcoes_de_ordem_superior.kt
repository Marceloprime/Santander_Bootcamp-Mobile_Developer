//função principal
fun main(){
    val z:Int
    z = calculate(34,90){ a,b -> 
        println("Vou calcular! $a * $b * 2") 
        (a + b) * 2 
    }

    println(z)
}

fun sun(a1:Int ,a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int) -> Int) = operation(n1,n2)