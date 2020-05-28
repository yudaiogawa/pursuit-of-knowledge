class Tp[A](var value: A) {
  def put(value: A): Unit = this.value = value
  def get(): A = this.value
}

class Pair[A, B](val x: A, val y: B) {
  override def toString(): String = "[x: " + x + ", y: " + y + "]"
}
