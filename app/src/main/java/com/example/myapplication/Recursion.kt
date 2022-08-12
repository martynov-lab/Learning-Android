package com.example.myapplication
import kotlin.math.*
fun main() {

    print("Введите количество чисел которые вы хотели бы ввести: ")
    val n:Int = readLine()?.toIntOrNull() ?:  return print("Вы ввели не число")
    val range = 1..n
    var sum = 0
    var quantity = 0
    for (i in range){
        print("Введите $i число: ")
        val index:Int = readLine()?.toIntOrNull() ?: continue
        sum += index
        if (index >= 0){
            quantity++
        }

    }
    println("Количество положительных чисел: $quantity")
    println("Сумма чисал: $sum")

    print("Введите число для вычисления НОД: ")
    val nod:Int = readLine()?.toIntOrNull() ?:  return print("Вы ввели не число")
    print("НОД = ${greatestCommonDivisor(nod, quantity)}")
}

 tailrec fun greatestCommonDivisor(a: Int, b: Int): Int {
     if (b == 0)
         return abs(a)
     return greatestCommonDivisor(b, a % b)
 }