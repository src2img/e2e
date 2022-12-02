val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "java-sbt",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "commons-io" % "commons-io" % "2.11.0"
  )

enablePlugins(JavaAppPackaging)
enablePlugins(UniversalPlugin)
