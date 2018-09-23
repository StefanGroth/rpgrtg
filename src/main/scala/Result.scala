import java.util.UUID

case class Result(var content : String,
                  var usage : BigInt = 0) {

  val id : UUID = UUID.randomUUID()

  override def toString: String = content

}
