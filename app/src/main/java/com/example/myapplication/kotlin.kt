package com.example.myapplication

fun main(){
    val number:Int = 10
    var num2: Long = number.toLong()

    println(num2+number)

    val number1:Int =20
    val max: Unit = if(number <= number1)   {
        println("a is greater than b")
    }
    else{
        println("b is greater than a")
    }
    println("max = $max")

    println("enter your name")
    val name:String? = readLine()
    println("your name is $name")

    var num = 4
    var numberprovided= when(num){
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "Invalid number"
    }
    println("$numberprovided")


    for(i:Int in 1..5){
        println(i)
        println("hello")
    }
    for(i:Int in 1..5 step 2){
        println(i)
    }

    for(i:Int in 5 downTo 1){
        println(i)
    }

    val x:Int = 5
    val y:Int = recursion(x)
    println("${y}")
}
fun recursion(x:Int): Int {
    return if(x==1){
        x
    }
    else{
        x*recursion(x-1)
    }
   val name:Any = "piyush"
    val name1:String? = name as? String
    val number:Int? = name as? Int
    println(number)
  //   var student = Student("piyush","b.tech")
    var student1  = Student("piyush",-1,"Coer")
    println(student1.name)
    println(student1.duration)
    student1.duration = -12
    println(student1.college)

}
class Student( nameparam:String ,  durationparam:Int,  collegeparam:String){
    var name:String = nameparam
    var college:String = collegeparam
    var duration:Int = durationparam
    set(value){
        if(value>0){
            field = value
        }
        else{
            println("duration can not be negative")
        }
    }
}