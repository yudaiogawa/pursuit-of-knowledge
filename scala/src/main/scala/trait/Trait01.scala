trait TraitA
trait TraitB

class ClassA extends TraitA {
  def printClassA(): Unit = println("This is ClassA.")
}

class ClassB
class ClassC extends ClassA with TraitA with TraitB

// To compile error because ClassB is not trait.
// class ClassD extends ClassA with ClassB

// The trait cannot take parameters.
// trait TraitC(foo: String)
