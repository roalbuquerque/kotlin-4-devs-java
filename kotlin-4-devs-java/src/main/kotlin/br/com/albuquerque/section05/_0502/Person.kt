package br.com.albuquerque.section05._0502

//class Person constructor(firstName: String, lastName: String) {
//class Person (firstName: String, lastName: String) {
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Create a Person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middle: String) :
        this(firstName, lastName) {
            println("Create a secundary constructor with Person named $firstName $middle $lastName")
        }
}