class Burguer(name: String, price: Double): Food(name, price){
    override fun cook(): String{
        return "La parrilla sacaba humo con un olor a deliciosas hamburguesas!"
    }
}