object Main {
  def main(args: Array[String]): Unit = {
    val tp = new Tp[Int](2)
    tp.put(4)
    println(tp.get())

    // tp.put("string value")
    //   --> type mismatch error

    def dvd(x: Int, y: Int): Pair[Int, Int] = new Pair[Int, Int](x / y, x % y)
    println(dvd(10, 3))

    def t2(x: Int, y: Int) = new Tuple2(x + y, x - y)
    // def t2(x: Int, y: Int) = (x + y, x - y)
    val a = 10
    val b = 3
    println(t2(a, b))

    def t4(x: Int, y: Int, z: Int, a: Int) = new Tuple4(x + y + z + a, x - y - z - a, x * y * z * a, x / y / z / a)
    // def t4(x: Int, y: Int, z: Int, a: Int) = (x + y + z + a, x - y - z - a, x * y * z * a, x / y / z / a)
    val c = 100
    val d = 200
    println(t4(a, b, c, d))
  }
}
