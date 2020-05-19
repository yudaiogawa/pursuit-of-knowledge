trait TraitC {
  val name: String
  def printName(): Unit = println(name)
}

class ClassE(val name: String) extends TraitC
