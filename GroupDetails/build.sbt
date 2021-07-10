lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """GroupDetails""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    ),libraryDependencies ++= Seq(
      jdbc
    ),
    libraryDependencies ++= Seq(
      "mysql" % "mysql-connector-java" % "5.1.41"
    )
  )

