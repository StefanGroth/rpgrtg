import scala.collection.mutable

case object RTGTable {

  def apply(name: String, attributes: RTGAttribute * ): RTGTable = new RTGTable(name, attributes.toList)

}

case class RTGTable(name : String, attributes : List[RTGAttribute]) {

  def rollAll() : mutable.Map[RTGAttribute, RTGResult] = {

    var res : mutable.Map[RTGAttribute, RTGResult] = mutable.Map.empty

    for(attribute <- attributes) {
      res += (attribute -> attribute.roll())
    }

    res
  }


}
