package org.vj.kotlin

fun main() {
    println("Hello")
    val p1 = Person(name = "Vimal", id = 1, age = 40)
    println("Hi ${p1.name}")
    val p2 = p1.copy(id = 2, name = "Suchitra")
    println("Hi ${p2.name}")

    val e1 = Employee()
    e1.name = "Vihaan"

    println("Hi ${e1.name}")
    println("Bye")
}