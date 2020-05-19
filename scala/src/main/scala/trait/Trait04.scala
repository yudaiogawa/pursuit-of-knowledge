// 線形化(linearization)

trait Trait04 {
  def greet(): Unit
}

trait Trait05 extends Trait04 {
  override def greet(): Unit = println("Call Trait05.greet()")
}

trait Trait06 extends Trait04 {
  override def greet(): Unit = println("Call Trait06.greet()")
}

class Class03 extends Trait05 with Trait06


trait Trait07 {
  def greet(): Unit = println("Call Trait07.greet()")
}

trait Trait08 extends Trait07 {
  override def greet(): Unit = {
    super.greet()
    println("Call Trait08.greet()")
  }
}

trait Trait09 extends Trait07 {
  override def greet(): Unit = {
    super.greet()
    println("Call Trait09.greet()")
  }
}

class Class04 extends Trait08 with Trait09
class Class05 extends Trait09 with Trait08
