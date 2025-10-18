package br.com.albuquerque.section05._0503

fun main() {

    val location1  = object {
        val xCoordinate: Int = 200
        val yCoordinate: Int = 400
    }

    println("Coordinates = (${location1.xCoordinate} Y: ${location1.yCoordinate})")

    val location = object {
        var xCoordinate: Int = 300
        var yCoordinate: Int = 600
        fun printLocation() {
            println("Coordinates = (${xCoordinate} Y: ${yCoordinate})")
        }
    }
    location.printLocation()

    location.xCoordinate = 3000
    location.yCoordinate = 6000

    location.printLocation()

    val temperature = MySingleton.getLastTemperature()
    println("Last temperature is $temperature °C")
}

object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}