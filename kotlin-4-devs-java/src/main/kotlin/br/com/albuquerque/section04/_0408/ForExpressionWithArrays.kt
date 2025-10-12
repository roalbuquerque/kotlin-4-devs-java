package br.com.albuquerque.section04._0408

fun main() {

    val pizzasOrdered = 7

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry, one pizza please")
        2 -> println("Very Hungry, two pizzas please")
        else -> println("Are you sure you want $pizzasOrdered pizzas?")
    }

    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0 pizzas")
    }

    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1 .. 4 -> println("Got some orders")
        in 5 ..9 -> println("Business is up ")
        else -> println("Are you sure you want $pizzasOrdered pizzas?")
    }

    when {
        pizzasOrdered <= 0 -> println("None orders")
        pizzasOrdered % 2 == 1 -> println("Odd number orders")
        pizzasOrdered % 2 == 0 -> println("Even number orders")
    }

}