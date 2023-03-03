import java.util.Scanner

fun main(){

    val reader = Scanner(System.`in`)
    println("Enter a number 1-10:")
    var num:Int = reader.nextInt()

    var array = IntArray(5) {(it * 1) - 1}
    for (element in array){
        println(element)
    }

}