trait TraitA
trait TraitB

class ClassA extends TraitA {
  def printClassA(): Unit = println("This is ClassA.")
}

class ClassB
class ClassC extends ClassA with TraitA with TraitB

// class ClassD extends ClassA with ClassB
//   -> To compile error because ClassB is not trait.

// trait TraitC(foo: String)
//   -> The trait cannot take parameters.
