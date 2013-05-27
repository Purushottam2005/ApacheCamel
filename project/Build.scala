import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "ApacheCamel"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "org.apache.camel" % "camel-core" % "2.11.0",
    "org.apache.camel" % "camel-scala" % "2.11.0",
	"junit" % "junit" % "4.11",
	"org.easymock" % "easymock" % "3.1",
	"org.slf4j" % "slf4j-api" % "1.7.5",
	"org.slf4j" % "slf4j-log4j12" % "1.7.5",
    "xml-resolver" % "xml-resolver" % "1.2",
    "org.osgi" % "org.osgi.core" % "5.0.0",
    "org.apache.camel" % "camel-juel" % "2.11.0",
    "org.apache.camel" % "camel-jxpath" % "2.11.0",
    "org.apache.camel" % "camel-test-spring" % "2.11.0",
    "org.apache.camel" % "camel-velocity" % "2.11.0",
    "org.scalatest" % "scalatest_2.10" % "2.0.M6-SNAP17"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
