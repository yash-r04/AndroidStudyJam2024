// implement a recursive function called factorial that calculates the factorial of a given non-negative integer.

// implement your function here
fun factorial(number: Int): Int{
    if (number==0 || number==1){
        return 1
    }
    else
    {
      return number * factorial(number-1)
      }
      
    }

fun main() {
    val result = factorial(5)
    val res = factorial(1)
    val re = factorial(0)
    println(result)
    println(res)
    println(re)
}

// function that calls itself is called recursive function
