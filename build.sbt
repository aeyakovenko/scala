lazy val root = (project in file(".")).
  settings(
    name := "empty",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.0" % "test"

coverageEnabled in Test := true
