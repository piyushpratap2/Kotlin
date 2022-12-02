package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    // Mutable array
    var number1:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    var str:Array<String> = arrayOf("Hello","World","how","are","you")
    for(i:Int in str.indices){
        println(i)
        println(str[i])
    }
    println(number1.size)
    println(number1.get(0))
    number1.set(2,15)
    println(number1.get(2))

    //Immutable List
    var name:List<Int> = listOf(1,2,3,4,5,6,7,8,9)
    var name1:List<Int> = listOf(1,2,3,4,5,6,7,8,9)

    println(name.containsAll(name1))
    println(name.subList(0,4))
    println(name.isEmpty())

    // Mutable List
    var number2:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8)
    number2.add(15)
    number2.removeAt(5)
    println(number2.drop(3))
    println(number2)
    // ArrayList
    var number = ArrayList<Int>()
    number.add(8)
    number.add(9)
    println(number)

    var empdata:ArrayList<emp> = arrayListOf<emp>()
       val e1 = emp("Piyush","b.tech","coer")
    val e2 = emp("Piyush","b.tech","coer")
    val e3 = emp("Piyush","b.tech","coer")
    val e4 = emp("Piyush","b.tech","coer")

    empdata.add(e1)
    empdata.add(e2)
    empdata.add(e3)
    empdata.add(e4)

    for(i:emp in empdata){
        println("${i.name}  ${i.course} ${i.college}")
    }

    // Map in Kotlin

    var mymap:Map<Int,String> = mapOf(1 to "kunwar",2 to "piyush",3 to "pratap")
    for(i:Map.Entry<Int,String> in mymap){
        println(i)
    }
    println(mymap.get(2))
    println(mymap.getOrDefault(4,"singh"))

    // Hashmap
    var hashmap = HashMap<Int,String>()
    hashmap.put(1,"Dit")
    hashmap.put(2,"petroleum")

    var map:HashMap<Int,String> = hashMapOf(1 to "first")
    map.put(2,"second")
    map.put(3,"third")

    map.replace(3,"fourth")

    for(i:Int in map.keys){
        println(map[i])
    }

    // kotlin set Immutable Interface

    var set:Set<Int> = setOf(1,2,3,4,6,7,8)
    println(set)
    println(set.isEmpty())

    // kotlin Mutable set Interface
    var set1:MutableSet<Int> = mutableSetOf<Int>(1,2,3,4,5,6)
    set1.add(7)
    set1.remove(3)
    println(set1)
    println(set1.first())

    // kotlin HashSet class
    var hs:HashSet<Int> = HashSet()
    hs.add(1)
    hs.add(2)
    hs.add(3)
    println(hs)

   //kotlin range
    val aToz:CharRange = 'a'..'z'
    val onetonine:IntRange = 1..9
    for(i:Char in aToz){
        print(i)
        print(" ")
    }



}