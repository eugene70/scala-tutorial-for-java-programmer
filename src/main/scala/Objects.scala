import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

object Greeting {
  def english = "Hi"
  def espanol = "Hola"

  def test1(): Unit = {
    Greeting.english should be("Hi")
    Greeting.espanol should be("Hola")
  }
  def test2(): Unit = {
    val x = Greeting
    val y = x
    x eq y should be(true)
    val z = Greeting
    x eq z should be(true)
  }
  def test3(): Unit = {
    val clark = new Person("Clark Kent", "Superman")
    val peter = new Person("Peter Parker", "Spider-Man")
    Person.showMeInnerSecret(clark) should be("Superman")
    Person.showMeInnerSecret(peter) should be("Spider-Man")
  }
  def main(args: Array[String]): Unit = {
    test1()
    test2()
    Movie.academyAwardBestMoviesForYear(1932).get.name should be("Grand Hotel")
    test3()
  }
}

class Movie(val name: String, val year: Short)

object Movie {
  def academyAwardBestMoviesForYear(x: Short): Option[Movie] =
    x match {
      //This is a match statement, more powerful than a Java switch statement!
      case 1930 => Some(new Movie("All Quite On the Western Front", 1930))
      case 1931 => Some(new Movie("Cimarron", 1931))
      case 1932 => Some(new Movie("Grand Hotel", 1932))
      case _ => None
    }
}

class Person(
            val name: String,
            private val superheroName: String
            )
object Person {
  def showMeInnerSecret(x: Person) = x.superheroName
}

