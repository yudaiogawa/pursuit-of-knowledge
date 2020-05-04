class ExCoordinate(x: Double, y: Double) extends Coordinate(x, y) {

  def callBaz(): Unit = {
    baz()
  }
}
