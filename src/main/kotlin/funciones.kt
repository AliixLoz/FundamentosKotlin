fun main(){
    println("Hello")
    sayHello()
    sayHelloTo("Peter Quil")
    sayHelloToFrom("Bruce Wayne", "Gotham City")
    println("El doble de 25 es ${ duplicate(25 )}")
    val result = divide( 99, 15.0)
    println("El resultado de 99 / 15 es $result")
    println(fullName("John", "Snow"))

    welcomeToMexico()
    welcomeToMexico("SpiderMan")

    sayHelloToFrom("SuperMan", "Metropolis")
    sayHelloToFrom(city="Namekusei", name="Pikoro")

}

// Funciones sin parametros y sin retorno
fun sayHello(){
    println("Hello!")
}

// Funciones con parametros y sin retorno
fun sayHelloTo(name: String){
    println("Hello $name")
    println("Welcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name from $city")
}

//Funciones con retorno
//Especificamos el tipo de dato
fun duplicate(num: Int): Int {
    return num * 2
}

fun divide(num1: Int, num2: Double): Double{
    return num1 / num2
}

fun fullName(firstName: String, lastName: String): String{
    return "$firstName $lastName"
}

//Funcion con parametro opcional
fun welcomeToMexico(name: String = "Invitado"): Unit{
    println("Welcome to Mexico $name")
}






