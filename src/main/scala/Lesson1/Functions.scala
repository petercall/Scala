package Lesson1

import scala.compiletime.ops.double

object Functions extends App {
    // def greetingFunction(name: String, age: Float): String = 
    //     "Hi, my name is " + name + " and I am " + age + " years old."

    // println(greetingFunction("John", 25.3f))

    // def factorial(n: Int): Int = {
    //     if()

    // }

    // val my_val: Int = if false then 
    //     10 
    // else if true then 
    //     20 
    // else 
    //     30
    // println(my_val)

    // val my_val = for 
    //     i <- 1 to 5
    //     if i % 2 == 0
    // do
    //     println(i)

    // println(my_val)

    
    val my_vect: Vector[Any] = Vector(1,2,"3")
    val my_new_vect = Vector(7,8,9)

    println(my_vect ++: my_new_vect)

}