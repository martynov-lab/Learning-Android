package com.example.myapplication

import kotlin.math.*

fun main() {
        print(solveEquation(8, 4, 2))

}

fun solveEquation (a: Int, b: Int, c: Int): String{
    val disc = discriminant(a, b, c)
    println("Discriminant = $disc")
    var solutionSum: String = when {
        disc > 0 -> {
            val x1 = (-b + sqrt(disc)) / (2 * a)
            val x2 = (-b - sqrt(disc)) / (2 * a)
            "Кореней два: \nx1 = $x1 \nx2 = $x2 \nСумма корней = ${x1+x2}"
        }
        disc == 0.0 -> {
            val x = -b / (2 * a)
            "Корень один = $x"
        }
        else -> {
            "Корней нет"
        }
    }
    return solutionSum
}

fun discriminant(a: Int, b: Int, c: Int) =  b.toDouble().pow(2) - 4 * a * c //вычисление дискриминанта


