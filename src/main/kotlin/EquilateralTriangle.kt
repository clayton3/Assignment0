class EquilateralTriangle(_name: String) : Triangle(_name) {
    var side: Double = 0.0
    fun setDimensions(_side: Double){
        side = _side
    }

    override fun getArea(): Double {
        val s: Double = (side*3) / 2
        return Math.sqrt(s*((s-side)*3))
    }

    override fun printDimensions() {
        println("The sides of this shape have a length of: " + side)
    }
}