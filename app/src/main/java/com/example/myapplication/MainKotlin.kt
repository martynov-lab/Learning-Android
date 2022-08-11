package com.example.myapplication

fun main (){
    val firstName = "Andrey"
    val lastName = "Martynov"
    var height: Int = 143

    var weight: Float = 93.0f
    var isChild: Boolean = height < 150 || weight < 40.0
    var childString: String = if (isChild) "I am a child" else "I am not a child"
    var info: String = "My name is $firstName $lastName, my height is $height, my weight is $weight and $childString"

    print(info)
}