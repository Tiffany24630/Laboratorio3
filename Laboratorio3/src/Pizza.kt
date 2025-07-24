class Pizza(name: String, price: Double): Food(name, price){
    override fun cook(): String{
        return "El horno fue prendido y se podía oler a pizza recien hecha!"
    }
}