fun main(args: Array<String>){
    val square = Square("Square")
    val circle = Circle("Circle")
    val triangle = Triangle("Triangle")
    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle")

    //Square
    print("Square info ('length' 'height'):\n")
    val squareInput = readLine()!!.split(" ")
    square.setDimensions(squareInput[0].toDouble(), squareInput[1].toDouble())
    println(square.name)
    square.printDimensions()
    println("Square Area:\n" + square.getArea())

    //Circle
    print("\nCircle info:\n")
    val circleInput = readLine()
    circle.setDimesnions(circleInput!!.toDouble())
    println(circle.name)
    circle.printDimensions()
    println("Circle Area:\n" + circle.getArea())

    //Triangle
    print("\nTriangle info ('Side 1' 'Side 2' 'Side 3'):\n")
    val triangleInput = readLine()!!.split(" ")
    triangle.setDimensions(triangleInput[0].toDouble(), triangleInput[1].toDouble(), triangleInput[2].toDouble())
    println(triangle.name)
    triangle.printDimensions()
    println("Triangle Area:\n" + triangle.getArea())

    //Equilateral Triangle
    print("\nEquilateral Triangle info ('Side'):\n")
    val eTriangleInput = readLine()
    equilateralTriangle.setDimensions(eTriangleInput!!.toDouble())
    println(equilateralTriangle.name)
    equilateralTriangle.printDimensions()
    println("\nEquilateral Triangle Area:\n" + equilateralTriangle.getArea())
}