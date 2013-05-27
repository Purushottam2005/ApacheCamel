package livedemo.processors

import org.apache.camel.{Exchange, Processor}
import livedemo.errorhandling.AbsurdException
import livedemo.beans.TransformationBean

class TransformationProcessor2 extends Processor {

  def process(exchange: Exchange) {

    val str = exchange.getIn(classOf[TransformationBean])
    //val str = "Oh oh, I will die now :-("
    println(str)
    str
  }
}