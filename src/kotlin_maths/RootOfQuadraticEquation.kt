package kotlin_maths

import kotlin.math.sqrt

fun main() {
    print("Enter the value of a")
    val a = readlnOrNull()?.toIntOrNull()

    print("Enter the value of b")
    val b = readlnOrNull()?.toIntOrNull()

    print("Enter the value of c")
    val c = readlnOrNull()?.toIntOrNull()

    if (a == null || b == null || c == null) return
    val discriminant = b * b - 4 * a * c
    val root1 = -b + sqrt(discriminant.toDouble()) / 2 * a
    val root2 = -b - sqrt(discriminant.toDouble()) / 2 * a
    println("Root :$root1")
    println("Root :$root2")

    if (discriminant == 0) return
    val root = -b / 2 * a
    println("Root :$root")
}