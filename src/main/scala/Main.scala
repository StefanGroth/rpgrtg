
object Main {

  def main(args: Array[String]): Unit = {



      val att = RTGAttribute("Name", List("Stefan", "Benedikt", "Falk"))
      att.results(1).usage = 1
      att.results(2).usage = 2

      for(i <- 1 to 10)
        println(att.roll())

  }
}