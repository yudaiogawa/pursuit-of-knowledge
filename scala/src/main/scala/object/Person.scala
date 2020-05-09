class Person(name: String, age: Int, private val weight: Int, private[this] val height: Int)

object Person {
  def printWeight(): Unit = {
    val taro = new Person("Taro", 20, 70, 190)
    println(taro.weight)
    // println(taro.height) // Not be accessed.
  }
}
