import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    var sideOne: Double = 0.0
    var sideTwo: Double = 0.0
    var sideThree: Double = 0.0
    fun setDimensions(_sideOne: Double, _sideTwo: Double, _sideThree: Double){
        sideOne = _sideOne
        sideTwo = _sideTwo
        sideThree = _sideThree
    }

    override fun getArea(): Double {
        val s: Double = (sideOne + sideTwo + sideThree) / 2
        return sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree))
    }

    override fun printDimensions() {
        println("The size of the first side of this shape is: " + sideOne)
        println("The size of the second side of this shape is: " + sideTwo)
        println("The size of the third side of this shape is: " + sideThree)
    }
}