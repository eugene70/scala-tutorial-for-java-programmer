package object advent2020 {
  def time(name: String, fn: () => Any): Unit = {
    val startMillis = System.currentTimeMillis()
    val result = fn()
    val endMillis = System.currentTimeMillis()
    println(s"$name result: $result, time: ${endMillis - startMillis} ms")
  }
}
