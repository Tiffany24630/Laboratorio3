/*
* Universidad del Valle de Guatemala
* Programación de plataformas móviles
* Sección: 20
* Autora: Tiffany Salazar Suarez
* Carnet: 24630
*/

//Video explicando el programa:

fun main() {
    //Extensión de clase food
    fun Food.discountedPrice(descuento: Double): Double{
        return descuento * price
    }

    //Instanciando las comidas
    val hamburguesa = Burguer("Mini", 4.50)
    val jugo = Juice("Naranja", 3.50)
    val pizza = Pizza("Peperoni", 8.50)
    val helado = IceCream("Fresa", 2.50)

    //Imprimiendo cook y eat de los alimentos
    println("ALIMENTOS DEL MENÚ:\nHamburguesa: ${hamburguesa.cook()}\nJugo: ${jugo.cook()}\nPizza: ${pizza.cook()}\nHelado: ${helado.cook()}")

    //Imprimiendo eat de helado
    println("Ha seleccionado comer helado: \n${helado.eat()}")

    //Imprimiendo descuentos en las hamburguesas
    println("Las hamburguesas cuentan con un descuento especial el dia de hoy: \nAntes: ${hamburguesa.price} \nAhora: ${hamburguesa.discountedPrice(0.5)}")
}