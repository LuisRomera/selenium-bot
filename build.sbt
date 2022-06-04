ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.4.2",
  "org.seleniumhq.selenium" % "selenium-java" % "4.2.1",
  "org.seleniumhq.selenium" % "selenium-chrome-driver" % "4.2.1"
)
