import scala.collection.mutable.ListBuffer
import scala.util.Random

case object RTGAttribute {

  def apply(name: String, resultNames : List[String]): RTGAttribute = new RTGAttribute(name, resultNames.map(name => RTGResult(name)).to[ListBuffer])

}

case class RTGAttribute(name : String, results : ListBuffer[RTGResult]) {

  private val randomGenerator : Random = Random

  def roll() : RTGResult = {

    val totalUsage : BigInt = results.map(_.usage).sum

    if(totalUsage == 0) {
      return results(randomGenerator.nextInt(results.size))
    }

    val normalization : BigInt = results.map(totalUsage - _.usage).sum

    val roll = randomGenerator.nextDouble()

    var prob : BigDecimal = 0

    for(result <- results) {

      prob += BigDecimal(totalUsage - result.usage) / BigDecimal(normalization)

      if(prob >= roll) return result

    }

    throw new Exception("Property roll function corrupt")
  }


}
