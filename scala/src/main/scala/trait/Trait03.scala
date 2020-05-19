// 菱形継承問題

trait Trait01 {
  def greet(): Unit
}

trait Trait02 extends Trait01 {
  def greet(): Unit = println("Call Trait02.greet()")
}

trait Trait03 extends Trait01 {
  def greet(): Unit = println("Call Trait03.greet()")
}

// class Class01 extends Trait02 with Trait03
// -> greet が呼ばれた時、Trait02.greet なのか Trait03.greet なのかが曖昧

// Resolve 01
// Class01 で greet を override
class Class01 extends Trait02 with Trait03 {
  override def greet(): Unit = println("Call Class01.greet()")
}

// Resolve 02
// superに型指定
class Class02 extends Trait02 with Trait03 {
  override def greet(): Unit = super[Trait03].greet()
}
