class Coordinate(val x: Double, val y: Double) {

  def +(c : Coordinate): Coordinate = {
    new Coordinate(x + c.x, y + c.y)
  }

  override def toString(): String = "(" + x + ", " + y + ")"

  private def foo(): Unit = {
    println("foo() is private method.")
  }

  private[this] def bar(): Unit = {
    println("bar() is private[this] method.")
  }

  protected def baz(): Unit = {
    println("baz() is protected method.")
  }

  def callFooBar(): Unit = {
    foo()
    bar()
  }
}
