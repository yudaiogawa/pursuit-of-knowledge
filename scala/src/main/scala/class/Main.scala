object Main {

  def main(args: Array[String]): Unit = {
    val coordinate = new Coordinate(35.681236, 139.767124)
    println(coordinate.toString())
    coordinate.callFooBar()

    val exCoordinate = new ExCoordinate(35.681236, 139.767124)
    exCoordinate.callBaz()

    val math = new Math()
    println(math.add(10)(10))
    val add100 = math.add(100) _
    println(add100(100))

    println(math.sub(10, 10))
    val sub100 = math.sub(100, _)
    println(sub100(50))

    new ExtendsSmpA().print
    new ExtendsSmpB().print

    // Test02
    var shape: Shape = new Rectangle(10.0, 20.0)
    println(shape.area)
    shape = new Circle(2.0)
    println(shape.area)
  }
}
