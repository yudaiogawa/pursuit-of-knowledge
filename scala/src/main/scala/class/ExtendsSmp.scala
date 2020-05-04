class ExtendsSmpA() {
  def print(): Unit = {
    println("A")
  }
}

class ExtendsSmpB() extends ExtendsSmpA {
  override def print(): Unit = {
    println("B")
  }
}
