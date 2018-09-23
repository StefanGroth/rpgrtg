import scala.collection.mutable

case class RandomTable(name : String, properties : List[Property]) {

  def rollAll() : mutable.Map[Property, Result] = {

    var res : mutable.Map[Property, Result] = mutable.Map.empty

    for(property <- properties) {
      res += (property -> property.roll())
    }

    res
  }


}
