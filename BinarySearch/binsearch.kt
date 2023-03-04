import java.util.Scanner

fun main(args: Array<String>){

    print("Enter your name: ")
    val name = readLine()!!

    val array = name.toCharArray()
    array.sort()
    
    print("Enter a letter from your name: ")
    val letter = readLine()!!.single()

    val high = array.size
    val position = bin_search(array, letter, 0, high-1)
    print("$letter first appears at position: $position")

}

fun bin_search (array: CharArray, letter: Char, low: Int, high: Int): Int {
    while (low <= high) {
        val mid = (low + high) / 2
        when {
            letter > array[mid] -> return bin_search(array, letter, mid+1, high)
            letter < array[mid] -> return bin_search(array, letter, low, mid-1)
            letter == array[mid] -> return mid

        }  
    }
    return -1 
}