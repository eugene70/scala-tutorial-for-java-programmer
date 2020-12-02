import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.matchers.must.Matchers.be

class Point(x: Int, y: Int) {
  override def toString: String = s"($x, $y)"
}
class ClassWithValParameter(val name: String) {
  override def toString: String = s"${this.getClass.getName}={$name}"
}

object Classes {
  def main(args: Array[String]): Unit = {
    val aClass = new ClassWithValParameter("Gandalf")
    aClass.name should be("Gandalf")
    println(new Point(1, 10))
    println(aClass)
  }
}