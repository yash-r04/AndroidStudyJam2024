// Create a function called displayPerson that takes two parameters: name and age. Call the function with named parameters, swapping their order.

// in your function, declare name first then age

fun displayPerson(name: String, age: Int){
    println("I am $name and I am $age (which means I have been around the sun $age times, cool isn't it!)")
}

fun main() {

    displayPerson(age = 25, name = "Charlie")
    displayPerson(age= 19, name = "yahaswini")
    
}

// when you specifically use the name of the parameter, you can use it in any order, you cannot do this in c++ or java
//ngl this aspect of parameter is so cool and interesting
