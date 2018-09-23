import scala.collection.mutable.ListBuffer

object Main {

  def fib(n : Int) : Int = {
    n match {
      case 0 => 1
      case 1 => 1
      case _ => fib(n - 1) + fib(n - 2)
    }
  }

  def main(args: Array[String]): Unit = {

    val heros = Property("Heros", ListBuffer(Result("Benedikt", 2), Result("Falk", BigInt("9000000000000000000000000000000")), Result("Stefan")))



    for(_ <- 1 to 100) {
      println(heros.roll())
    }


  }
}