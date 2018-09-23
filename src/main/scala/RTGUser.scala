import scala.collection.mutable.ListBuffer

case class RTGUser(var name : String,
                   var randomTables : ListBuffer[RTGTable] = ListBuffer.empty) {

}
