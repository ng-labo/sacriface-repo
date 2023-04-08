name := """play-scala-seed"""
organization := "xyz.balus"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.17"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += specs2 % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "xyz.balus.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "xyz.balus.binders._"
