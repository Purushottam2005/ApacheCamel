package livedemo.processors

import org.apache.camel.{Exchange, Processor}
import livedemo.errorhandling.AbsurdException
import livedemo.beans.TransformationBean
import org.apache.log4j.Logger

class TransformationProcessor2 extends Processor {

  val logger = Logger.getLogger(this.getClass.getName)
  
  def process(exchange: Exchange) {

    val str = exchange.getIn()
    //val str = "Oh oh, I will die now :-("
    logger info str
    str
  }
}