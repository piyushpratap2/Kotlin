package com.example.myapplication

fun main(){
    val obj = child()
    obj.mymethod2()
    obj.mymethod()
}
 open class parent{
    val car:String = ""
    fun mymethod(){
        println("thisn is parent class")
    }
}
class child:parent(){
    val model:String = ""
    fun mymethod2(){
        println("this is child class")
    }
}