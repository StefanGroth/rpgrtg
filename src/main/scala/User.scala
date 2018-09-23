import scala.collection.mutable.ListBuffer

case class User(var name : String,
                var randomTables : ListBuffer[RandomTable] = ListBuffer.empty) {

}
