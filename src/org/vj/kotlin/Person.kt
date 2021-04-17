package org.vj.kotlin

data class Person(
    val id: Int,
    val name: String,
    var age: Int = 0,
    var country: String? = null
)
