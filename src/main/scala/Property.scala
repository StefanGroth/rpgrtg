import scala.collection.mutable.ListBuffer
import scala.util.Random

case class Property(name : String, results : ListBuffer[Result]) {

  private val randomGenerator : Random = Random

  def roll() : Result = {
    results(randomGenerator.nextInt(results.size))
  }

}
