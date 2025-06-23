package dev.bcmedeiros.kt78442

import kotlin.reflect.jvm.kotlinFunction

fun main() {
    val method = KpSync::class.java.getMethod("getRepository")
    println(method.kotlinFunction)
}
