trait Trait10 {
  val foo: String
}

trait Trait11 extends Trait10 {
  // val bar = foo + "World"
  lazy val bar = foo + "World"
}

class Class06 extends Trait11 {
  val foo = "Hello"
  def printBar(): Unit = println(bar)
}

// ---- Early Definitions ----

trait Trait12 {
  def foo: String
}

trait Trait13 extends Trait12 {
  def bar = foo + "World"
}

class Class07 extends { val foo = "Hello" } with Trait13 {
  def printBar(): Unit = println(bar)
}
