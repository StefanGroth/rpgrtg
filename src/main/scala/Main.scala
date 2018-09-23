import java.text.AttributedCharacterIterator.Attribute

object Main {

  def fib(n : Int) : Int = {
    n match {
      case 0 => 1
      case 1 => 1
      case _ => fib(n - 1) + fib(n - 2)
    }
  }

  def main(args: Array[String]): Unit = {

  }
}