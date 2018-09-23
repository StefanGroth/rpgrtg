import java.util.UUID

case class RTGResult(var name : String,
                     var usage : BigInt = 0) {

  val id : UUID = UUID.randomUUID()

  override def toString: String = name

}
