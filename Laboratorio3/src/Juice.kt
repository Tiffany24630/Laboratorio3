class Juice(name: String, price: Double): Drink(name, price){
    override fun cook(): String{
        return "Se escucha cómo se parte la fruta y empieza a ser mezclada!"
    }
    override fun pour(): String{
        return "El jugo es vertido en el vaso lentamente para no crear espuma!"
    }

}