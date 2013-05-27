package livedemo.routes

import org.apache.camel.scala.dsl.builder.RouteBuilder
import livedemo.processors.TransformationProcessor
import livedemo.processors.TransformationProcessor2
import livedemo.errorhandling.ErrorLog
import livedemo.beans.TransformationBean
import livedemo.beans.TransformationBean2

class RuntimeExceptionRoute extends RouteBuilder with ErrorLog {


//  "direct:goToException" bean(new TransformationBean) process(new TransformationProcessor)

  "direct:goToException" bean(classOf[TransformationBean]) process(new TransformationProcessor2) bean(classOf[TransformationBean2])

  
  // alternative for calling a bean: bean(classOf[TransformationBean]
}