package controllers

import play.api._
import play.api.mvc._

import org.apache.camel.impl.DefaultCamelContext
import org.apache.log4j.Logger
import livedemo.routes.{RuntimeExceptionRoute, FileToFileRoute}

object Application extends Controller {

  val logger = Logger.getLogger(this.getClass.getName)
  
  def index = Action {
    {
      val camelContext = new DefaultCamelContext
      camelContext.addRoutes(new FileToFileRoute)
      camelContext.addRoutes(new RuntimeExceptionRoute)

      logger.info("starting...")
      camelContext.start

      Thread.sleep(2000)

      logger.info("stopping...")
      camelContext.stop
    }
    Ok(views.html.index("Your new application is ready."))
  }

}

import org.apache.camel.scala.dsl.builder.RouteBuilder

class MyRouteBuilder extends RouteBuilder {
  "direct:a" --> "mock:a"
  "direct:b" to "mock:b"

  "direct:e" ==> {
    -->("mock:e")
    -->("mock:f")
  }

  "direct:g" ==> {
    to("mock:g")
    to("mock:h")
  }

  def route = "direct:a" routeId "route-b" to "mock:b"

}