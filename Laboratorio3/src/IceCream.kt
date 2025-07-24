class IceCream(name: String, price: Double): Food(name, price), Dessert{
    override fun cook(): String{
        return "Se escucha cómo se abre la nevera y en ella se ingresa la mezcla que será convertida en helado!"
    }

    override fun eat(): String{
        return "Me enfrié el cerebro"
    }
}