package br.com.albuquerque.section04._0409

fun main() {

    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")
    //Função com inferencia
    println("10 + 10 = ${myExpressionBodyFunctionWithInference(10, 10)}")
    //Com valores default sem setar algum parâmetro
    println("10 + 10 = ${myFunctionWithDefaults(10, 10)}")
    //Com valor default quando eu seto algum parametro
    println("10 + 10 = ${myFunctionWithDefaults(10, 10, "Hello")}")
    //Quando seto alguns parâmetros e determinado a qual parâmetro que isso se refere
    println("Default SUM = ${myFunctionWithDefaults(message = "Hello")}")

}

fun myMathFunction(x: Int, y: Int): Int {
    return x + y
}

fun myExpressionBodyFunction(x: Int, y: Int): Int = x + y


fun myExpressionBodyFunctionWithInference(x: Int, y: Int) = x + y


fun myFunctionWithDefaults(x: Int = 1, y: Int = 5, message: String = "Hi" ): Int {
    val result = x + y
    println(message)
    return result
}