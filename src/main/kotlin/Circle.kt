class Circle(_name: String): Shape(_name) {
    var radius: Double = 0.0;
    fun setDimesnions(_radius: Double){
        radius = _radius
    }

    override fun getArea(): Double {
        return Math.PI * (2 * radius)
    }

    override fun printDimensions() {
        println("The radius of this shape is: " + radius)
    }
}