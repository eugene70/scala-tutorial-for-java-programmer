import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.matchers.must.Matchers.be

object Options {
  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Found value") else None
  }

  def main(args: Array[String]): Unit = {
    val someValue: Option[String] = Some("I am wrapped in something")
    someValue should be(Some("I am wrapped in something"))
    val emptyValue: Option[String] = None
    emptyValue should be(None)
    val value1 = maybeItWillReturnSomething(true)
    val value2 = maybeItWillReturnSomething(false)
    value1 getOrElse "No value" should be("Found value")
    value2 getOrElse "No value" should be("No value")
    value1.isEmpty should be(false)
    value2.isEmpty should be(true)

    val someValue2: Option[Double] = Some(20.0)
    val value = someValue2 match {
      case Some(v) => v
      case None => 0.0
    }
    value should be(20.0)

    val noValue: Option[Double] = None
    val value3 = noValue match {
      case Some(v) => v
      case None => 0.0
    }
    value3 should be(0.0)

    test5
    test6
  }

  def test5: Unit = {
    val number: Option[Int] = Some(3)
    val noNumber: Option[Int] = None
    val result1 = number.map(_ * 1.5)
    val result2 = noNumber.map(_ * 1.5)

    result1 should be(Some(4.5))
    result2 should be(None)
  }

  def test6: Unit = {
    val number: Option[Int] = Some(3)
    val noNumber: Option[Int] = None
    val result1 = number.fold(1)(_ * 3)
    val result2 = noNumber.fold(1)(_ * 3)

    result1 should be(9)
    result2 should be(1)
  }
}