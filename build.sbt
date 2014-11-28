name := """kainos_november_hackaton"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "3.0",
  "org.mongodb" % "mongo-java-driver" % "2.12.4",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
