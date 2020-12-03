import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import java.util.Date

class Tuples {

}

object Tuples {
  def test1(): Unit = {
    val t = (1, "hello", Console)
    val tt = Tuple3(1, "hello", Console)
    println(t)
    println(tt)
    println(t == tt)
  }
  def test2(): Unit = {
    val tuple = ("apple", "dog")
    val fruit = tuple._1
    val animal = tuple._2
    fruit should be("apple")
    animal should be("dog")
  }
  def test3(): Unit = {
    val tuple5 = ("a", 1, 2.2, new Date(), "five")
    tuple5._2 should be(1)
    tuple5._5 should be("five")
  }
  def test4(): Unit = {
    val student = ("Sean Rogers", 21, 3.5)
    val (name, age, gpa) = student
    name should be("Sean Rogers")
    age should be(21)
    gpa should be(3.5)
  }
  def test5(): Unit = {
    val tuple = ("apple", 3).swap
    tuple._1 should be(3)
    tuple._2 should be("apple")
  }
  def main(args: Array[String]): Unit = {
    test1()
    test2()
    test3()
    test4()
    test5()
  }
}