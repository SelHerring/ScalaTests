name := "ExampleProject"

version := "1.0"

scalaVersion := "2.11.8"

//val postgresDriver = "postgresql" % "postgresql" % "8.4-701.jdbc4"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.4",
  "org.squeryl" % "squeryl_2.11" % "0.9.6-RC3"
)