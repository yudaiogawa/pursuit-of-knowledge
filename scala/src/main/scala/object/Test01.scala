class Test01(val x: Int, private[this] val y: Int, private val z: Int)

object Test01 {
  def printZ(): Unit = {
    val test01 = new Test01(10, 20, 30)
    println(test01.z)
    // println(test01.y) // That's impossible...
  }
}
