ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild/ organization := "georgehotzsucksFinaglePOC"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "georgehotzsucksFinaglePOC",
      libraryDependencies ++= {
        val twitterVersion = "22.7.0"
        Seq(
          "com.twitter" %% "finagle-http" % twitterVersion,
          "com.twitter" %% "finagle-thrift" % twitterVersion,
          "com.twitter" %% "scrooge-core" % twitterVersion,
          "org.apache.thrift" % "libthrift" % "0.16.0",
          "com.typesafe" % "config" % "1.4.2",
          "ch.qos.logback" % "logback-classic" % "1.4.5"
        )
      }
  )

